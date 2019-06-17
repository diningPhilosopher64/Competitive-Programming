//https://www.interviewbit.com/problems/greatest-common-divisor/

public class Solution {
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

