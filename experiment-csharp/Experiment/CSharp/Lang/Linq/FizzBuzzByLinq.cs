using System;
using System.Linq;
using System.Text;

namespace Experiment.CSharp.Lang.Linq

{
    class FizzBuzzByLinq
    {
        public static void Main(string[] args)
        {
            Enumerable.Range(1, int.Parse(args[0])).Select(i =>
            {
                StringBuilder builder = new StringBuilder();
                if (i % 3 == 0)
                {
                    builder.Append("Fizz");
                }
                if (i % 5 == 0)
                {
                    builder.Append("Buzz");
                }
                return (builder.Length == 0) ? i.ToString() : builder.ToString();
            }).ToList().ForEach(i => Console.WriteLine(i));
            Console.ReadKey();
        }
    }
}
