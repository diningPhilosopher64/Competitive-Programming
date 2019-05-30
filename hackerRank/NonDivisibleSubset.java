//https://www.hackerrank.com/challenges/picking-numbers/problem

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NonDivisibleSubset
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

        int size = scanner.nextInt(); int k = scanner.nextInt();
        int[] arr = new int[size];


        for( int i = 0; i < size;i++) arr[i] = scanner.nextInt();


        System.out.println(Solver.solve(arr,k));

    }
}

class Solver
{
   static int solve(int[] arr, int k)
    {
        int max = 0;

        //(a+b)%k = (a%k + b%k)%k;
        //Modifying the given array to the above form

        int size = arr.length;
        for(int i = 0 ; i < size; i++) arr[i] = arr[i] %k;

        //Creating and filling count array
        int[] count = new int[k+1];
        for(int i = 0; i<size;i++) count[arr[i]] += 1;


        if(count[0] > 0) max = 1;


        // if k is odd , possible indices apart from 0 are : 1,k-1 ; 2,k-2 etc
        // if k is even , apart from 0 , we can also include k/2 once
        if(k % 2 == 0)
        {
            size = (k/2) - 1;
        }
        else
             size = k/2;

        for(int i = 1 ; i <= size; i++ )
            max += Math.max(count[i],count[k-i]);


        if(k%2 ==0 && count[k/2] > 0)
            max += 1;


        return  max;
    }
}
