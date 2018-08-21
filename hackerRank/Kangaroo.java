//https://www.hackerrank.com/challenges/kangaroo/problem
import java.io.*;
import java.util.StringTokenizer;
public class Kangaroo
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
        int x1 = fs.nextInt();
        int v1 = fs.nextInt();
        int x2 = fs.nextInt();
        int v2 = fs.nextInt();

        System.out.println(new Solver().solve(x1,v1,x2,v2));
    }
}

class Solver
{
    String solve(int x1, int v1 ,int x2,int v2)
    {
        int match = 0;
        int behind,ahead,speed1,speed2 ;
        if(x1 < x2)
        {
            behind = x1; ahead = x2;
            speed1 = v1;speed2 = v2;
        }
        else
        {
            behind = x2; ahead = x1;
            speed1 = v2; speed2 = v1;
        }

        if( (x1<x2 && v1<=v2) || (x1>x2 && v1>=v2)) return "NO";



        else
        {
            while(behind - ahead <= 0)
            {
                behind += speed1;
                ahead += speed2;
                if(behind - ahead == 0)
                {
                    match = 1 ; break;
                }
            }

            if(match == 1) return "YES";
            else return "NO";
        }

    }
}