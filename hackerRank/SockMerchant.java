//https://www.hackerrank.com/challenges/sock-merchant

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SockMerchant
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
        int input;Integer count;
        HashMap<Integer,Integer> socks = new HashMap<>();
        int size = fs.nextInt();

        for(int i = 0 ; i < size ; i++)
        {
            input = fs.nextInt();
            count = socks.get(input);
            if(count == null) count = 0;
            socks.put(input,count+1);
        }

       // System.out.println(socks);

        System.out.println(new Solver().solve(socks));
    }

}


class Solver
    {
        public int solve(HashMap<Integer, Integer> socks)
        {
            int pairs = 0;

            for(int value : socks.values())
            {
               // System.out.println(value);
                pairs += value/2;
            }


            return pairs;
        }
    }


