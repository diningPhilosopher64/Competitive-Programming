//https://www.interviewbit.com/problems/reverse-integer/


      public int reverse(int A)
    {
        int max = Integer.MAX_VALUE;
        long reverseConvertedNumber;
        String inString = Integer.toString(A);
        StringBuilder stringBuilder ;


        if(A < 0)
        {
            stringBuilder = new StringBuilder(inString.substring(1));
            stringBuilder.append('-');
            stringBuilder.reverse();

        }

        else
        {
            stringBuilder = new StringBuilder(inString); stringBuilder.reverse();
        }




        reverseConvertedNumber = Long.parseLong(stringBuilder.toString());


        if(reverseConvertedNumber > Integer.MAX_VALUE || reverseConvertedNumber < Integer.MIN_VALUE)
            return 0;

        else
        return (int)reverseConvertedNumber;








    }
