 public ArrayList<Integer> findPerm(final String A, int B) 
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int numberOfDs = A.length() + 1;
            
        char current; int counter = 1;
        for(int i =0; i < A.length(); i++)
        {
            current = A.charAt(i);
            
            if(current == 'I')
            {
                result.add(counter); counter += 1;
            }
            
            if(current == 'D')
            {
                result.add(numberOfDs); numberOfDs -= 1;
            }
            
        }
        
        //Add last I/D
        if(A.charAt(A.length() - 1) == 'I')
            result.add(counter);
        else
            result.add(numberOfDs);
        
        
        return result;
        
    }