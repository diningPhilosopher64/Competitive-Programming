//https://www.interviewbit.com/problems/rotated-array/

public class Solution {
    // DO NOT MODIFY THE LIST
    public int findMin(final List<Integer> a)
    {
        int left = 0, right = a.size() - 1, mid = 0;
        int min = 0;

          if(a.get(0) < a.get(a.size() -1))
            return a.get(0);

        while(left < right)
        {
            mid = (left + right)/2;

            if(left == mid)
                break;

            if(a.get(mid) > a.get(mid + 1) && a.get(mid) > a.get(mid - 1))
            {
                break;
            }

            else if(a.get(mid) < a.get(right))
                right = mid;

            else
                left = mid;

        }

        min = mid + 1;

        return a.get(min);

    }
}

