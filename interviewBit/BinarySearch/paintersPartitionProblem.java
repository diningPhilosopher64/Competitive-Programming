//https://www.interviewbit.com/problems/painters-partition-problem/

import java.math.BigInteger;
public class Solution {

    public int paint(int A, int B, ArrayList<Integer> C)
    {
        ArrayList<BigInteger> list = new ArrayList<>();
        BigInteger sum = BigInteger.ZERO,current = BigInteger.ZERO;
        for(int i = 0; i < C.size(); i++)
        {
            current =  BigInteger.valueOf(C.get(i));
            current = current.multiply(BigInteger.valueOf(B));
            list.add(current);
            sum = sum.add(current);

        }

        BigInteger low = BigInteger.ZERO, high = sum; BigInteger mid = BigInteger.ZERO;int possible;
        BigInteger min =BigInteger.ZERO;

        while(high.compareTo(low) >= 0)
        {
            mid = (high.add(low)).divide(BigInteger.valueOf(2));
            possible = check(A, mid, list);
            if(possible == 1)
            {
                high = mid.subtract(BigInteger.valueOf(1));
                min = mid;
            }

            else
                low = mid.add(BigInteger.valueOf(1));
        }

        return min.remainder(BigInteger.valueOf(10000003)).intValue();
    }


    public int check(int B, BigInteger time, ArrayList<BigInteger> list)
    {
        int i = B;
        BigInteger currentTime = BigInteger.ZERO;

            for(int j =0; j < list.size(); j++)
            {
               currentTime =  currentTime.add(list.get(j));


                if(currentTime.compareTo(time) > 0)
                {
                    i -= 1; currentTime = BigInteger.ZERO; j -= 1;
                    if(i ==0)
                        return 0;
                }

            }

            if(i >= 0 && currentTime.compareTo(time) <= 0)
                return 1;

            else
                return 0;

    }

}

