//https://www.hackerrank.com/challenges/electronics-shop/problem

// O(nlogn) solution

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ElectronicsShop
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
        int b =fs.nextInt();int n = fs.nextInt(); int m = fs.nextInt();

        int[] keyBoard = new int[n]; int[] usb = new int[m];


        for(int i =0;i < n; i++)  keyBoard[i] = fs.nextInt();
        for(int i =0;i < m; i++)  usb[i] = fs.nextInt();


        Arrays.sort(keyBoard); Arrays.sort(usb);


       new Solver().solver(b,n,m,keyBoard,usb);

    }

}


class Solver
{
    void solver(int b, int n,int m, int[] keyBoard, int[] usb)
    {
        int i = n-1;
        int low,high,middle,sum = 0,max = 0;
        while(i >= 0)
        {
            low = 0;high = m-1;
            while(low <= high)
            {
                middle = (low + high)/2;
                sum = keyBoard[i] + usb[middle];
                if(sum == b)
                {
                    System.out.println(b); return;
                }

                else if(sum< b)
                {
                    if(sum > max) max = sum;
                    low = middle + 1;
                }
                else
                {
                    high = middle - 1;
                }
            }
            i--;
        }

        if(max == 0) System.out.println(-1);
        else
            System.out.println(max);
    }
}
