//https://www.interviewbit.com/problems/power-of-two-integers/

public int isPower(int A)
    {
        int result = 0;
        int limit = (int)Math.ceil(Math.sqrt(A));

        if(A == 1)
            return 1;

        for(int i = 2; i <= limit; i++)
        {
            for(int j = 2; j <= limit; j++)
            {
                if(Math.pow(i,j) == A)
                {
                    result = 1;
                    return result;
                }
            }
        }


        return result;
    }
