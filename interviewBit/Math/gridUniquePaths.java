//https://www.interviewbit.com/problems/grid-unique-paths/

public class Solution {

   public int uniquePaths(int A, int B)
    {
        int paths = 0;

        if(A == 0 && B == 0)
            return 1;

        if(A ==0 || B == 0)
            return 0;


        paths = answer(A -1,B - 1);
        return  paths;
    }


    public int answer(int A, int B)
    {
        if(A ==0 || B == 0)
            return 1;

        return answer(A-1,B) +answer(A,B-1);
    }


}

