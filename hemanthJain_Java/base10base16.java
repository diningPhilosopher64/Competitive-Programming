import java.io.*;
import java.util.StringTokenizer;

public class base10base16
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
        System.out.println("Enter a number");
        int number = fastReader.nextInt();

        StringBuilder stringBuilder = new StringBuilder();

       stringBuilder.append(Solver.solve(number, 16));

       System.out.println(stringBuilder.reverse());    

   }


}


class Solver
{

    static String chars = "0123456789ABCDEF";
    static String result = "";

    static String solve(int number, int base)
    {



        if( number == 0 )
            return "";

        int remainder = number % base;
        char digit = Solver.chars.charAt(remainder);


        result += digit;

        number /= base;

        solve(number,base);


        return result;



    }
}