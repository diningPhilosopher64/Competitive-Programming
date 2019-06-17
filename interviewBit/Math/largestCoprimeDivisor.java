//https://www.interviewbit.com/problems/largest-coprime-divisor/

public class Solution {
    public ArrayList<Integer> allFactors(int A)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(A == 0)
        {
            result.add(0); return result;
        }

        int limit = (int)Math.sqrt(A);

        for(int i = 1; i <= limit; i++)
        {
            if(A % i == 0)
            {
                if(A/i != i)
                {
                    result.add(i); result.add(A/i);
                }

                else
                    result.add(i);
            }
        }

        Collections.sort(result);


        return result;
    }

    public int cpFact(int A, int B)
    {
               int max = 0;


        ArrayList<Integer> divisors = allFactors(A);
        int current;
        for(int i =0; i < divisors.size(); i++)
        {
            current = divisors.get(i);
            if(gcd(current,B) == 1)
                max = current;

        }

        return max;
    }





    public int gcd(int A, int B)
    {

        if(B == 0)
            return A;

        if(A == 0)
            return B;


        if(A > B)
            return gcd(B, A%B);
        else
            return gcd(A,B%A);

    }

}

