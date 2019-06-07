public ArrayList<Integer> allFactors(int A) 
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if(A == 0)
        {
            result.add(0); return result;
        }
        
        int limit = (int)Math.sqrt(A);
        
        for(int i = 1; i <= limit; i++)
        {
            if(A % i == 0)
            {
                if(A/i != i)
                {
                    result.add(i); result.add(A/i);
                }
                
                else
                    result.add(i);
            }
        }
        
        Collections.sort(result);
        
        
        return result;
    }
