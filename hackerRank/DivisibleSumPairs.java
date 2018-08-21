//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
import java.io.*;
import java.util.StringTokenizer;

public class DivisibleSumPairs
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
        int divisor = fs.nextInt();

        int[] arr = new int[size];

        for(int i = 0 ; i < size; i++) arr[i] = fs.nextInt();


        System.out.println(new Solver().solve(arr,size,divisor));
    }
}


class Solver
{
    int solve(int[] arr, int size, int divisor)
    {
        int noOfPairs = 0;

        for( int i = 0 ; i < size - 1; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                if((arr[i] + arr[j]) % divisor == 0) noOfPairs += 1;
            }
        }

        return noOfPairs;
    }
}
