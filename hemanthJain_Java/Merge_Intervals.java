import java.util.*;


import java.io.*;
import java.util.StringTokenizer;


class Pair
{
    int left;
    int right;

    public  Pair(int left, int right)
    {
        this.left = left;
        this.right = right;
    }
}


public class Merge_Intervals
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
        System.out.println("Enter number of pairs");
        FastReader fastReader = new FastReader();
        int numberOfPairs = fastReader.nextInt();
        int first,second;

        List<Pair> listOfPairs = new ArrayList<>();

        for(int i =0; i < numberOfPairs; i++)
        {
            first = fastReader.nextInt();
            second = fastReader.nextInt();

            listOfPairs.add(new Pair(first,second));
        }




       listOfPairs = Solver.mergeIntervals(listOfPairs);



        for(Pair pair : listOfPairs)
        {
            System.out.println(pair.left + " " + pair.right);
        }


    }

}



class Solver
{

    static List<Pair> mergeIntervals (List<Pair> listOfPairs)
    {
        Collections.sort(listOfPairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair pair, Pair t1) {
                if (pair.left > t1.left)
                    return 1;
                else
                    return -1;
            }
        });



        int first, second = 1;

        for(first = 0; first< listOfPairs.size() - 1; first++)
        {
            Pair current = listOfPairs.get(first);
            Pair next = listOfPairs.get(second);

            while (second < listOfPairs.size() && current.right >= next.left)
            {
                if(current.right <= next.right)
                    current.right = next.right;
                listOfPairs.remove(second);
                listOfPairs.set(first,current);

                if(second < listOfPairs.size())
                    next = listOfPairs.get(second);

            }

            second += 1;


        }


        return listOfPairs;
    }


}
