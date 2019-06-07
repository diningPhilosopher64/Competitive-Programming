    public String findDigitsInBinary(int A) 
    {
        int remainder; 
        StringBuilder str = new StringBuilder();
        if(A == 0)
        {
            str.append("0");
            return str.toString();
        }
        while(A > 0)
        {
            remainder = A%2;
            A /= 2;
            str.append(String.valueOf(remainder));
            
        }
        
        if(A > 0)
        str.append(String.valueOf(A));
        
        
     str.reverse();
     
     return str.toString();
        
        
    }

