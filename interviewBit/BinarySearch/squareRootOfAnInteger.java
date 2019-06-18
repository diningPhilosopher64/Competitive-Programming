//https://www.interviewbit.com/problems/square-root-of-integer/

public class Solution {
     public int sqrt(int a)
    {
        if(a == 0) return 0;
        if(a == 1) return 1;

        long low = 0, high = a, mid;

        while(low <= high)
        {
            mid = low + (high - low)/2;

            if(mid * mid == (long)a) return (int)mid;

            else if(mid * mid < a) low = mid + 1;

            else high = mid - 1;

        }


        return (int)high;
    }

}

