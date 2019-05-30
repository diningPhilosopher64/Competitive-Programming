/*
2 methods to solve :
    1) Count occurances and print
    2) Use a pointers and keep swaping till 0's are segregated to the left.
 */



import java.io.*;
import java.util.StringTokenizer;


public class Segregating0And1
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

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();

        System.out.println("Enter size of array");
        int size = fastReader.nextInt();
        int[] arr = new int[size];

        for(int i =0; i < size; i++)
            arr[i] = fastReader.nextInt();


        Solver.solveCount(arr,size);



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

    static void solveCount(int[] arr,int size)
    {
    int zerosCount = 0, onesCount = 0;

    for(int i =0; i < size; i++)
    {
        if(arr[i] == 0)
            zerosCount += 1;
        if(arr[i] == 1)
            onesCount += 1;
    }


    for(int i =0; i < zerosCount; i++)
    {
        System.out.print("0 ");
    }

      for(int i =0; i < onesCount; i++)
      {
          System.out.print("1 ");
      }


    }


    static int next0Location(int[] arr, int endpointer)
    {
        while(endpointer >= 0)
        {
            if (arr[endpointer] == 0)
                break;
            endpointer -= 1;
        }

        return endpointer;
    }

    static void solveSwap(int[] arr,int size)
    {
        int frontpointer = -1, endpointer;

        endpointer = next0Location(arr, size - 1);



        if (endpointer == 0)
        {
            printArray(arr);
            return;
        }



        while(frontpointer != endpointer)
        {
            frontpointer += 1;

            if(arr[frontpointer] == 1)
            {
                swap(arr, frontpointer, endpointer);
                frontpointer += 1;
                endpointer = next0Location(arr,endpointer);
                continue;
            }


        }



    }
}
