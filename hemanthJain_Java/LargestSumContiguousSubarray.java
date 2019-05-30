
import java.io.*;
import java.util.StringTokenizer;

public class LargestSumContiguousSubarray
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


        System.out.println("Enter array size");
        int size = fastReader.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = fastReader.nextInt();
        }

        Solver.solve(arr);


    }

}

class Solver
{
    static void solve(int[] arr)
    {

        int maxSum = 0, currentSum = 0;
        for(int i =0;i < arr.length; i++)
        {
            currentSum += arr[i];

            if(currentSum > maxSum)
                maxSum = currentSum;

            if(currentSum < 0)
                currentSum =0;
        }

        System.out.println(maxSum);
    }
}