// Finds Max and Min elements of a Sorted and Rotated Array in O(logN) time

import java.io.*;
import java.util.StringTokenizer;

public class MaxAndMinElelementInSortedNRotatedArray
{
    static  class FastReader
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
        FastReader fastReader = new FastReader();
        System.out.println("Enter size");

        int size = fastReader.nextInt();
        int[] arr = new int[size];

        for(int i =0; i < size; i++)
            arr[i] = fastReader.nextInt();

        System.out.println("Max element is :" + Solver.solveMax(arr,0,size -1));

        System.out.println("Min element is :" + Solver.solveMin(arr,0,size -1));


    }


}


class Solver
{
    public static int solveMax(int[] arr, int low , int high)
    {
        int mid = low + (high- low)/2;

        if(low == high)
            return arr[high];

        if (Math.abs(high - low ) == 1)
            return Math.max(arr[low],arr[high]);


        if (arr[mid] > arr[high])
           return solveMax(arr,mid,high);
        else
            return solveMax(arr,low,mid);
    }


    public static int solveMin(int[] arr, int low, int high)
    {

        int mid = low + (high- low)/2;

        if(low == high)
            return arr[high];

        if (Math.abs(high - low ) == 1)
            return Math.min(arr[low],arr[high]);


        if (arr[mid] > arr[high])
            return solveMin(arr,mid,high);
        else
            return solveMin(arr,low,mid);

    }
}
