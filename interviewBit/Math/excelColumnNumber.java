// https://www.interviewbit.com/problems/excel-column-number/

public int titleToNumber(String A)
    {
        int result = 0;
        int lb = (int)'A';

        if(A.length() == 1)
        {
            return (int)A.charAt(0) - lb + 1;
        }

        char current; int value;
        for(int i = A.length() - 2; i >= 0; i--)
        {
            current = A.charAt(i);
            value = (int)Math.pow(26, A.length() - 1 - i);

            result += value;

        }

        result += A.charAt(A.length() - 1) - lb + 1;


        return result;
    }
