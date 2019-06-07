    public int isPrime(int A) 
    {
        if(A <= 1)
            return 0;
        if(A == 2)
            return 1;
        int limit = (int)Math.sqrt(A);
        
        for(int i = 2;  i <= limit; i++)
        {
            if(A % i == 0)
                return 0;
                
        }
        
        return 1;
        
    }
