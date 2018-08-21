//https://www.hackerrank.com/challenges/the-birthday-bar/problem

import java.io.*;
import java.util.StringTokenizer;

public class BirthdayChocolate
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

        int size = fs.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < size; i++) arr[i] = fs.nextInt();

        int date = fs.nextInt(); int month = fs.nextInt();

        System.out.println(new Solver().solve(arr,date,month,size));

    }
}


class Solver
{
    int solve(int[] arr, int date, int month,int size)
    {
        int noOfWays = 0,sum = 0;

        for(int i = 0 ; i <= size - month; i++)
        {
            sum = 0;
            for(int j = i ; j < i + month; j++)
            {
                sum += arr[j];
                if(sum > date) break;
            }

            if(sum == date) noOfWays += 1;
        }



        return  noOfWays;
    }
}