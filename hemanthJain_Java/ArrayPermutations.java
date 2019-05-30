    import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayPermutations
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
        System.out.println("Enter array size");
        int size = fastReader.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");

        for(int i = 0; i < size; i++)
            array[i] = fastReader.nextInt();



        Solver.permutations(array,0,array.length-1);


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

    static int[] swap(int[] copy,int i, int j)
    {
        int temp = copy[i];
        copy[i] = copy[j];
        copy[j] = temp; 

        return copy;
    }



    static void permutations(int[] array, int left ,int right)
    {
        if ( left == right)
            printArray(array);

        else
        {
            for(int i = left; i <= right; i++)
            {
                array = swap(array,i,left);
                permutations(array,left+1,right);
                array = swap(array,i,left);
            }
        }
    }

}