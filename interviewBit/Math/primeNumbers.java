    public ArrayList<Integer> sieve(int A) 
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(A <= 1)
            return result;
            
        if(A == 2)
            {
                result.add(2); return result;
            }
        
        int limit, flag ;
        for(int i = 2; i <= A; i++ )
        {
            limit = (int)Math.sqrt(i);
            flag = 0;
            for(int j = 2; j<= limit; j++)
            {
                if(i%j == 0)
                {
                    flag =1; break;
                }
            }
            
            if(flag == 0)
                result.add(i);
        }
        
        return result;    
        
    }
