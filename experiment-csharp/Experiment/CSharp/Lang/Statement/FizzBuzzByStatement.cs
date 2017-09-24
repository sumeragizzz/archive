using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Experiment.CSharp.Lang.Statement
{
    public class FizzBuzzByStatement
    {
        public static void Main(string[] args)
        {
            for (int i = 1; i <= int.Parse(args[0]); i++)
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
                if (builder.Length == 0)
                {
                    builder.Append(i);
                }
                Console.WriteLine(builder.ToString());
            }
            Console.ReadKey();
        }
    }
}
