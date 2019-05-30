//https://www.interviewbit.com/problems/repeat-and-missing-number-array/

    public ArrayList<Integer> repeatedNumber(final List<Integer> A)
    {
        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();



        int current = 0;
        for(int i =0; i < A.size();i++)
        {
            current = A.get(i);
            if(!map.containsKey(current))
                map.put(current,1);
            else
                {
                    map.put(current, map.get(current) + 1 );
                    result.add(current);
                }
        }

        for(int i =1; i <= A.size(); i++)
        {
            if(!map.containsKey(i))
                {
                    result.add(i);
                    break;
                }

        }



        return result;
    }
