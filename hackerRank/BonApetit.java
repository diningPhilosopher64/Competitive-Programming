//https://www.hackerrank.com/challenges/bon-appetit/problem

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BonApetit
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
        int n = fs.nextInt(); int k = fs.nextInt();int b;

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++) arr[i] = fs.nextInt();


        b = fs.nextInt();



        new Solver().solve(n,k,b,arr);



    }
}


class Solver
{
   void solve(int n , int k, int b , int[] arr)
    {
        int sum = Arrays.stream(arr).sum();
        int b_actual = (sum - arr[k])/2;

        if(b==b_actual) System.out.println("Bon Appetit");

        else
        {
            System.out.println(b-b_actual);
        }

    }
}
