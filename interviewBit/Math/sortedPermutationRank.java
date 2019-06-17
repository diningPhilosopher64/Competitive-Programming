//https://www.interviewbit.com/problems/sorted-permutation-rank/

import java.math.BigInteger;
public class Solution {
 public BigInteger factorial(long number)
    {
        if(number == 0 || number == 1) return BigInteger.ONE;

        else
            return factorial( number - 1).multiply(BigInteger.valueOf(number));
    }

    public int findRank(String A)
    {
       BigInteger result = BigInteger.ONE;
       BigInteger mod = BigInteger.valueOf(1000003);
       char[] temp = A.toCharArray(); Arrays.sort(temp);
       StringBuilder sorted =  new StringBuilder(new String(temp));


       long index, size = A.length() - 1; String current;
       for(int i =0; i < temp.length - 1; i++)
       {
           current = Character.toString(A.charAt(i)) ;
           index = sorted.indexOf(current);

           result = result.add(BigInteger.valueOf(index).multiply(factorial(size - (long)i).remainder(mod)) );

           sorted.deleteCharAt((int)index);


       }

       return result.remainder(BigInteger.valueOf(1000003)).intValue() ;
    }
}

