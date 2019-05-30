//https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

public int maxSubArray(final List<Integer> A) 
    {
        int sum , maxSum ;
        sum = maxSum = A.get(0);
        
        int current;
        for( int i = 1; i < A.size(); i++)
            {
                
                current = A.get(i);
                
                sum += current;
                
                if(current > sum)
                    sum = current;

                
                if(sum > maxSum)
                    maxSum = sum;
                
            }
            
            return maxSum;
        
    }
