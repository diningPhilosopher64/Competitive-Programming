//https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.io.*;
import java.util.StringTokenizer;

public class AppleAndOrange
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
        StringBuilder stringBuilder = new StringBuilder();
        Solver solver ;



        int start = fs.nextInt(); int end = fs.nextInt();
        int aTree = fs.nextInt(); int oTree = fs.nextInt();

        int noOfApples = fs.nextInt();int noOfOranges = fs.nextInt();


        int[] apples = new int[noOfApples];int[] oranges = new int[noOfOranges];

        for(int i = 0 ; i < noOfApples; i++) apples[i] = fs.nextInt();

        for(int i = 0; i < noOfOranges; i++) oranges[i] = fs.nextInt();




        solver = new Solver(start,end,aTree,oTree,noOfApples,noOfOranges,apples,oranges);

            //sout takes more time.
//        System.out.println(solver.applesOnHouse());
//        System.out.println(solver.orangesOnHouse());

            //Printing using StringBuilder
            stringBuilder.append(solver.applesOnHouse()).append("\n").append(solver.orangesOnHouse());
            System.out.println(stringBuilder.toString());





    }
}

class Solver
{
    int start; int end;
    int aTree ; int oTree;

    int noOfApples ;int noOfOranges;

    int[] apples;int[] oranges ;


    Solver(int start,int end,int aTree,int oTree,int noOfApples,int noOfOranges,int[] apples, int[] oranges)
    {
        this.start = start;this.end=end;this.aTree = aTree;this.oTree = oTree;this.noOfOranges = noOfOranges;
        this.noOfApples = noOfApples; this.apples = apples; this.oranges = oranges;
    }
    int applesOnHouse()
    {
        int count = 0,distance = 0;

        for(int i = 0 ; i < noOfApples; i++)
        {
            if(apples[i] < 0) continue;

            else
            {
                distance = aTree + apples[i];
                if(distance >= start && distance <= end ) count += 1;
            }
        }


        return count;
    }

    int orangesOnHouse()
    {
        int count = 0, distance = 0;

        for(int i = 0; i < noOfOranges;i++)
        {
            if (oranges[i] > 0) continue;

            else
            {
                distance = oTree + oranges[i];
                if(distance >= start && distance <= end) count += 1;
            }

        }

        return  count;
    }

}


