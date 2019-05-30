//https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.io.*;
import java.util.StringTokenizer;

public class DayOfTheProgrammer
{
    static class FastReader
    {
        BufferedReader br;
        BufferedWriter bw;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
        int year = fs.nextInt();

        new Solver().solve(year);
    }
}


class Solver
{

    void solve(int year)
    {


        if(year <= 1917)
        {
            if(checkLeapYearJulian(year))
            {
                System.out.println("12.09."+year); return;
            }

            else
            {
                System.out.println("13.09."+year); return;
            }
        }

        else if(year == 1918)
        {
            System.out.println("26.09."+year); return;
        }

        else
        {
            if(checkLeapYear(year))
            {
                System.out.println("12.09."+year);return;
            }

            System.out.println("13.09."+year); return;
        }

    }


    Boolean checkLeapYear(int year)
    {
        if ((year % 4 == 0) && (year % 100 != 0))
            return true;
        if (year % 400 == 0)
            return true;

        return false;
    }

    Boolean checkLeapYearJulian(int year)
    {
        if(year % 4 == 0) return true; return false;
    }

}