    public ArrayList<Integer> wave(ArrayList<Integer> A)
    {
        Collections.sort(A);
        
        
        int temp;
        if(A.size() % 2 == 0)
        for(int i =0; i < A.size() - 1; i+=2)
        {
            temp = A.get(i);
            A.set(i,A.get(i+1));
            A.set(i + 1, temp);
        }
        
        
        else
        {
            for(int i =0; i < A.size() - 2; i+=2)
            {
                temp = A.get(i);
                A.set(i,A.get(i+1));
                A.set(i + 1, temp);
            }
            
        }
        
        
        
        return A;
        
        
        
    }

