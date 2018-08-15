//https://www.hackerrank.com/challenges/grading/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GradingStudent
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader fs = new FastReader();
        Solver Solve = new Solver();

        int testCases = fs.nextInt();
        int input;
        while(testCases-- > 0)
        {
            input = fs.nextInt();
            System.out.println(Solve.solve(input));
        }


    }
}

class Solver
{
    public int solve(int grade)
    {
        int dividend;
        if(grade < 38) return grade;

        else
        {
            dividend = grade/5;
            if((dividend+1) * 5 - grade < 3) return (dividend+1)*5;

            else
                return grade;
        }
    }
}
