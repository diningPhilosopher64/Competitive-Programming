//https://www.hackerrank.com/challenges/migratory-birds/problem

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class MigratoryBirds
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
        int size = fs.nextInt();


        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        int temp =0;

        int[] arr = new int[size];
        for(int i = 0 ; i < size; i++)
        {
            temp = fs.nextInt();
            if(hmap.get(temp) == null) hmap.put(temp,1);

            else hmap.put(temp,hmap.get(temp) + 1);
        }

        System.out.println(new Solver().solve(hmap));

    }
}

class Solver
{

    int solve(HashMap<Integer,Integer> hmap)
    {
        int max = 0,current = 0,currentKey = 0;

        for(Integer key : hmap.keySet())
        {
            current= hmap.get(key);

            if(current > max)
            {
                max = current;
                currentKey = key;
            }
        }


        return  currentKey;
    }
}

