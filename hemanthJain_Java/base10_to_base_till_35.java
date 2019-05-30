//Converts from base 10 to any base till base 35.

import java.io.*;
import java.util.StringTokenizer;

public class base10_to_base_till_35
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
        System.out.println("Enter a number and the base to be converted to");
        int number = fastReader.nextInt();
        int base = fastReader.nextInt();


        System.out.println(Solver.solve(number,base));


    }


}


class Solver
{
    static String solve(int number, int base)
    {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ",convertedNumber = "";
        String toUse = chars.substring(0, base);

        StringBuilder generatedNumber = new StringBuilder();

        int remainder = 0;
        while(number > 0)
        {
            remainder = number % base;

            generatedNumber.append(toUse.charAt(remainder));
            number = number / base;
        }



        convertedNumber = generatedNumber.reverse().toString();
        return convertedNumber;
    }
}
