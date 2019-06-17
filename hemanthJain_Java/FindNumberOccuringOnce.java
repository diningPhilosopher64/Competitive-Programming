public FindNumberOccuringOnce
{

   public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-1,-1,5,5,7,7,9,11,11,13,13,15,15,20,20,22,22));

        System.out.println(new Solution().findNumberAppearingOnce(A));      

    }


public int findNumberAppearingOnce(ArrayList<Integer> A)
    {
        int low = 0, high = A.size() -1, mid;
        int index = 0;

        //checking if the number appearing once is in the last or first position
        if(A.get(0) != A.get(1))
            return 0;
        if(A.get(A.size() - 1) != A.get(A.size() - 2))
            return A.size() - 1;


        // If only 1 number is present in the array then just return that array.
        if(A.size() == 1)
            return A.get(0);


        while(low <= high)
        {
            mid = low + (high - low)/2;


            if(A.get(mid) != A.get(mid - 1) && A.get(mid) !=A.get(mid - 1))
                return mid;

            if(mid % 2 == 0)
            {
                if(A.get(mid) == A.get(mid -1 ))
                    high = mid - 2;

                else
                    low = mid + 2;
            }

            else
            {
                if(A.get(mid) == A.get(mid - 1))
                    low = mid + 1;

                else
                    high = mid - 1;
            }


        }


        return index;
    }



}