//https://www.interviewbit.com/problems/trailing-zeros-in-factorial/

public class Solution
{
      public int trailingZeroes(int A)
    {
        int result = 0;

        if (A <= 4)
            return result;

        int five  = 5, number = 0;
        while((A/five)>0)
        {
            number = (int)Math.floor(A/five);
            result += number;
            five *= 5;
        }


        return result;


    }
}

