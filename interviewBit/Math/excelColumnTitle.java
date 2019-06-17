//https://www.interviewbit.com/problems/excel-column-title/

 public String convertToTitle(int A)
    {
        StringBuilder str = new StringBuilder();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";



        int remainder ;
        while(A > 0)
        {
            remainder = A % 26;
            A /= 26;
            if(remainder == 0)
            {
                str.append('Z');
                A -= 1;
                continue;
            }

            str.append(letters.charAt(remainder - 1));

        }


        str.reverse();




        return str.toString();

    }
