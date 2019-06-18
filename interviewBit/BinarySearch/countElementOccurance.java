// https://www.interviewbit.com/problems/count-element-occurence/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int findCount(final List<Integer> A, int B)
    {
        int location = 0;
        int left = 0, right = A.size() - 1;
        int mid = 0, flag = 0;
        while(left <= right)
        {
            mid = (left + right)/2;

            if(A.get(mid) == B)
            {
                flag = 1;
                break;
            }

            else if(A.get(mid) < B)
                left = mid + 1;

            else
                right = mid - 1;

        }

        if(flag == 0)
            return 0;

        int firstMatch = mid;
        left = 0; right = mid;

        location = mid;
        while(left < right)
        {
            mid = (left + right)/2;

            if(A.get(mid) == B)
            {
                location = mid; right = mid;
            }


            else if(A.get(mid) < B)
                left = mid + 1;

            else
                right = mid - 1;
        }

        int firstOccurance = location;
        left = firstMatch; right = A.size() - 1;


        while(left <= right)
        {
            mid = (left + right)/2;

            if(A.get(mid) == B)
            {
                location = mid; left = mid + 1;
            }

            else if(A.get(mid) < B)
                left = mid + 1;

            else
                right = mid - 1;

        }

        int lastOccurance = location;

        return lastOccurance - firstOccurance + 1;

    }
}

