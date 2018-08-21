//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
import java.io.*;
import java.util.StringTokenizer;

public class BreakingTheRecords
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

        int n = fs.nextInt();

        int[] arr = new int[n];

        for (int i =0 ; i < n ; i++) arr[i]= fs.nextInt();

        new Solver().solve(arr);

    }

}


class Solver
{
    void solve(int[] arr)
    {
        int minimum,min = 0,maximum,max= 0;
        maximum = minimum = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < minimum)
            {
                minimum = arr[i]; min += 1;
            }

            else if(arr[i] > maximum)
            {
                maximum = arr[i]; max += 1;
            }
        }

        System.out.println(max +" " +min);
    }
}
