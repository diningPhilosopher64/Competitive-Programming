 public ArrayList<Integer> subUnsort(ArrayList<Integer> A)
    {
        ArrayList<Integer> result = new ArrayList<>();
 
int g = 0;
        for(int i =0; i < A.size() -1; i++)
        {
            if(A.get(i) <= A.get(i+1))
                g =0;
            else
            {
                g = 1; break;
            }
        }
 
        if(g == 0)
        {
            result.add(-1); return result;
        }
 
 
 
        int current, l = -1, r = -1,flag = 0, max= A.get(0), next;
 
        for(int i = 0; i < A.size(); i++)
        {
            current = A.get(i);
            if(current >= max)
            {
                max = current;
                if(flag == 0)
                    l = i;
            }
 
            else
            {
                r = i; flag= 1;
            }
 
 
        }
 
        if(l == -1)
        {
            result.add(-1);
            return  result;
        }
 
 
        int min = Collections.min(A.subList(l,r+1)); int i;
        for( i = 0; i < l; i++)
        {
            if(min >= A.get(i))
                continue;
 
            else
                break;
        }
 
        if(i < l)
           l = i;
 
 
 
 
        result.add(l); result.add(r);
 
 
        return result;
 
    }
