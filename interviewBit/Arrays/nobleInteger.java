public int solve(ArrayList<Integer> A)
    {
        int result = -1;
        Collections.sort(A);
        
       for(int i = 0; i < A.size() - 1; i++)
       {
           if(A.get(i) != A.get(i+1) && A.get(i) == (A.size() -1 - i))
            return 1;
       }
       
       if(A.get(A.size()- 1) == 0)
            return 1;
        
        
        
       
        
        return result;
        
        
        
    }

