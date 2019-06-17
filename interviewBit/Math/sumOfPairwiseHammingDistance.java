//https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/ 

public int hammingDistance(final List<Integer> A)
    {
    int mod = 1000000007;
       // BigInteger sum = new BigInteger("0"), count;

        long x,y;
        long sum = 0;
        for(int i =0; i < 31; i++)
        {
            x = 0; y = 0;
            for(int j =0; j < A.size(); j++)
            {
                if(((long)A.get(j) & (long)(1<<i)) == (long)(1<<i))
                    y += 1;
                else
                    x+=1;

            }
            sum += 2*x*y;
        }


        sum = sum % mod;
        return (int)sum;


    }
