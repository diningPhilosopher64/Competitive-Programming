import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class PairSumInArrayIsX
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
        System.out.println("Enter size");
        int size = fastReader.nextInt();
        int[] arr= new int[size];


        System.out.println("Enter array elements");
        for(int i =0; i < size; i++)
            arr[i] = fastReader.nextInt();

        System.out.println("Enter the sum");
        int sum = fastReader.nextInt();


        Solver.solveHash(arr, sum);



    }


}


class Solver
{

    public static void solveSort(int[] arr, int sum)
    {
        Arrays.sort(arr);

        int start = 0, end = arr.length -1;
        int flag= 0;

        while(start < end)
        {
            if(sum == arr[start] + arr[end]) {
                System.out.println("Elements are " + arr[start] + " " + arr[end]);
                flag = 1;
                break;
            }

            if(sum < arr[start] + arr[end])
                end -= 1;
            else if (sum > arr[start] +  arr[end])
                start += 1;
        }


        if(flag == 0)
            System.out.println("No Pair exists for that sum");

    }

    public static void solveHash(int[] arr, int sum)
    {
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++)
            set.add(arr[i]);

        int temp;
        for(int i =0; i< arr.length; i++)
        {
            temp = sum - arr[i];

            if(set.contains(temp))
            {
                System.out.println("Elements are " + temp + " " + (sum - temp));
                break;
            }
        }


    }
}