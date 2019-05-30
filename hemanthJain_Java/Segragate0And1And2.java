// The Dutch National Flag problem.

import java.io.*;
import java.util.StringTokenizer;

public class Segragate0And1And2
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

        System.out.println("Size : ");
        int size = fastReader.nextInt();
        int[] arr = new int[size];

        for(int i =0; i < size; i++)
            arr[i] =  fastReader.nextInt();

        Solver.solve(arr,size);

    }

}

class Solver
{
    static void printArray(int[] copy)
    {

        for(int i=0; i<copy.length; i++)
            System.out.print(" "+copy[i]);
        System.out.println();
    }

    static int[] swap(int[] arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    static void solve(int[] arr, int size)
    {

        int low = 0, mid = 0, high = size - 1;

        while(mid <= high)
        {
            if (arr[mid] == 0)
            {
                swap(arr, low , mid);

                low += 1;
                mid += 1;

            }

            else if(arr[mid] == 1)
            {
                mid += 1;
            }

            else if (arr[mid] == 2)
            {
                swap(arr, mid, high);
                high -= 1;
            }

        }

        printArray(arr);


    }



}





