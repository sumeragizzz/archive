package scorer.mahjong.game;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class GameService {

    @Inject
    private GameRepository repository;

    public Game find(int id) {
        return repository.find(id);
    }

}
