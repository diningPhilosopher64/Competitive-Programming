//https://www.interviewbit.com/problems/palindrome-integer/

 public int isPalindrome(int A)
    {
        if(A < 0)
            return 0;
        if(A == 1)
            return 1;


        int flag = 1, remainder, lhs;
        for(int i =0; i < String.valueOf(A).length() / 2; i++)
        {
            remainder = A % 10;
            lhs = String.valueOf(A).charAt(i) - '0';

            if(lhs != remainder)
            {
                flag = 0; break;
            }

            A = A/10;
        }
        return flag;
    }
