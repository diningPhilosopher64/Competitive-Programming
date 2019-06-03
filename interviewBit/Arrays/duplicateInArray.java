
    public int repeatedNumber(final List<Integer> a) 
    {
        int max = Collections.max(a);
        int diff = (int)Math.sqrt(max);
        
        ArrayList<Integer> A = new ArrayList<>(a);
        
        int i = 0,counter = 0, leftRange = diff * counter, rightRange = diff*(counter+1);
        HashSet<Integer> set = new HashSet<Integer>();
        int left = 0,current,temp;
        while(leftRange <= max)
        {
            current = A.get(i);
            
            if(current <= rightRange && current >= leftRange)
            {
                if(!set.contains(current))
                    set.add(current);
                else
                    return current;
            }
                
            if(current <= rightRange && current >= leftRange)
            {
                temp = A.get(left);
                A.set(left,current);
                A.set(i,temp);
                left += 1;
            }
                
                
            i+=1;
            
            if(i == A.size())
                {
                    i = left;  counter += 1;
                    leftRange = diff * counter; rightRange = diff*(counter+1);
                    set.clear();
                }
            
            
        }   
        
        return -1;
        
    }

