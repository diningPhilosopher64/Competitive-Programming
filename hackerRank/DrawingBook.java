//https://www.hackerrank.com/challenges/drawing-book/problem
import java.io.*;
import java.util.StringTokenizer;
public class DrawingBook
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
        int p = fs.nextInt();

        System.out.println(new Sovler().solve(n,p));
    }
}


class Sovler
{

    int solve(int n , int p)
    {
        int fromEnd = (n-p)/2;
        if(n % 2 == 0)
        {
            fromEnd = (int)Math.ceil((double)(n-p)/2);
        }
        int fromBeg = (int)Math.ceil((double)(p - 1)/2);

        return Math.min(fromEnd,fromBeg);
    }

}