import java.util.*;
import java.io.*;

public class CatAndMouse
{

    public static class FastScanner
    {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) throws Exception
        {
            br = new BufferedReader(new FileReader(s));
        }

        public FastScanner() throws Exception
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() throws Exception
        {
            while (st == null || !st.hasMoreElements())
                st = new StringTokenizer(br.readLine());

            return st.nextToken();
        }

        String nextLine() throws IOException
        {
            String str = "";
            str = br.readLine();


            return str;
        }

        int nextInt() throws Exception
        {
            return Integer.parseInt(nextToken());
        }

        long nextLong() throws Exception
        {
            return Long.parseLong(nextToken());
        }

        double nextDouble() throws Exception
        {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) throws Exception
    {
        final FastScanner fastScanner = new FastScanner();
        final StringBuilder stringBuilder = new StringBuilder();
        int tCases = fastScanner.nextInt();
        int aCat,bCat,cMouse;


        while (tCases-- > 0)
        {
            aCat = fastScanner.nextInt();bCat=fastScanner.nextInt();cMouse = fastScanner.nextInt();

            stringBuilder.append(new Solver().reachesFirst(aCat,bCat,cMouse));
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder.toString());



    }
}


class Solver
{
    String reachesFirst(int aCat, int bCat, int cMouse )
    {
        int adistance = Math.abs(cMouse - aCat);
        int bdistance = Math.abs(cMouse - bCat);

        if(adistance == bdistance) return "Mouse C";

        return  (adistance > bdistance) ? "Cat B" :"Cat A" ;
    }
}
