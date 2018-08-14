//https://www.hackerrank.com/challenges/between-two-sets/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class BetweenTwoSets {
	
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
                catch (IOException  e)
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
	
	
	Boolean firstCheck(int[] firstArray, int number)
	{			
		for(int i = 0; i < firstArray.length; i++)	
		{
			if(number % firstArray[i] != 0) return false;	
		}
		return true;
	}
	
	Boolean secondCheck(int[] secondArray, int number)
	{		
		for(int i =0 ; i < secondArray.length; i++)
		{
			if(secondArray[i] % number != 0) return false;
		}
		
		return true;
	}
	
	int betweenSets(int[] firstArray, int[] secondArray)
	{
		int count = 0;
		int firstMax = Arrays.stream(firstArray).max().getAsInt();
		int secondMin = Arrays.stream(secondArray).min().getAsInt();
		int inc = 1;
		
		int current = firstMax;
		
		while(current <= secondMin)
		{
			
			current = firstMax * inc;
			
			if(firstCheck(firstArray, current) && secondCheck(secondArray, current))					
				count += 1;				
			
			inc += 1;
		}
		

		
		return count;
		
		
	}
	 
	public static void main(String[] args) throws IOException
	{

		FastReader fs = new FastReader();
		BetweenTwoSets betweentwoSets = new BetweenTwoSets();
		
		int n = fs.nextInt();
		int m = fs.nextInt();
		
		int[] firstArray = new int[n];
		int[] secondArray = new int[m];
		
		for(int i = 0 ; i < n; i++) firstArray[i] = fs.nextInt();		
		for(int i = 0 ; i < m; i++) secondArray[i] = fs.nextInt();
		
		
		int count = betweentwoSets.betweenSets(firstArray, secondArray);
		
		
		System.out.println(count);
		

		
		
	
		
		
	}

}
