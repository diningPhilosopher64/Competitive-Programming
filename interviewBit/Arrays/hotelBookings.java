    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K)
    {
         boolean  result = false;
 
        Collections.sort(arrive); Collections.sort(depart);
        int currentEntry, currentLeave;
        int i =0, j =0;
        while(K >= 0)
        {
 
            if(i == arrive.size())
            {
                result = true;
                break;
            }
 
            currentEntry = arrive.get(i);
            currentLeave = depart.get(j);
 
            if(currentEntry == currentLeave)
            {
                i += 1; j += 1;
                continue;
            }
 
            if(currentEntry > currentLeave)
            {
                K += 1;
                j += 1;
            }
 
            else
            {
                K -= 1;
                i += 1;
            }
 
 
 
        }
 
 
        return result;
        
        
    }
