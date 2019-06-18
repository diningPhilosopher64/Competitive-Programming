//https://www.interviewbit.com/problems/allocate-books/

public class Solution {
    public int books(ArrayList<Integer> A, int B)
    {
        if(A.size() < B)
            return -1;

        else if(A.size() == B)
            return Collections.max(A);


        long sum = 0;
        for(int i =0; i < A.size(); i++)
          sum += A.get(i);

        long low = 0 , high = sum, mid = 0, min = -1;



        while(low <= high)
        {
            mid = low + (high - low)/2;

            if(isPossible(A,B, mid))
            {
                high = mid - 1; min = mid;
            }

            else
                low = mid + 1;

        }

        return (int)min;

    }



    public boolean isPossible(ArrayList<Integer> A, int B, long pages)
    {
        boolean possibility = false;
        long curPages = 0;
        for(int i =0; i < A.size(); i++)
        {
            curPages += A.get(i);

            if(curPages > pages)
            {
                B -= 1; curPages = 0; i -= 1;

                if(B == 0)
                    return possibility;

            }

        }

        if(B >= 0 && curPages <= pages)
            possibility = true;



        return possibility;
    }

}

