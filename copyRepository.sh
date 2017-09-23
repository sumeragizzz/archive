#!/usr/bin/bash

ACCOUNT=sumeragizzz
ARCHIVE=archive

if [ $# -ne 1 ]; then
    echo "parameter error"
    exit 1
fi
REPO=$1

echo "account = [$ACCOUNT]"
echo "from repository = [$REPO]"
echo "to   repository = [$ARCHIVE]"

echo "ok? [y/n]"
read ANSWER
if [ $ANSWER != 'y' ]; then
    echo "cancel"
    exit 2
fi

echo "start"

git remote add $REPO git@github.com:$ACCOUNT/$REPO.git
git fetch $REPO
git checkout -b $REPO $REPO/master
git filter-branch -f --tree-filter "mkdir $REPO && bash -c 'git mv -k {,.[!.],..[!.]}* $REPO/'"
git checkout master
git merge $REPO

echo "end"

