//https://www.hackerrank.com/challenges/picking-numbers/problem

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PickingNumbers
{
    public static class FastScanner
    {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) throws Exception
        {
            br = new BufferedReader(new FileReader(s));
        }

        public FastScanner() throws Exception
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() throws Exception
        {
            while (st == null || !st.hasMoreElements())
                st = new StringTokenizer(br.readLine());

            return st.nextToken();
        }

        String nextLine() throws IOException
        {
            String str = "";
            str = br.readLine();


            return str;
        }

        int nextInt() throws Exception
        {
            return Integer.parseInt(nextToken());
        }

        long nextLong() throws Exception
        {
            return Long.parseLong(nextToken());
        }

        double nextDouble() throws Exception
        {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) throws Exception
    {
        FastScanner scanner = new FastScanner();
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for(int i =0; i < size; i++) arr[i] = scanner.nextInt();

        System.out.println(new Solver().solve(arr));



    }
}

class Solver
{

    int solve(int[] arr)
    {
        int max = 0;

        int[] count = new int[101];

        for(int i =0 ; i < arr.length; i++)
            count[arr[i]] += 1;


        for(int i = 0; i < count.length-1;i++)
        {
            if(count[i] + count[i+1] > max) max  = count[i] + count[i+1];
        }



        return max;
    }
}
