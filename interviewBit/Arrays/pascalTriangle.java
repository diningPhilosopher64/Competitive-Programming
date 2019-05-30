//https://www.interviewbit.com/problems/pascal-triangle/

  public ArrayList<ArrayList<Integer>> solve(int A)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<Integer>());

        if(A == 0)
        {
            result.get(0).add(1);
            return result;
        }

        result.add(new ArrayList<Integer>());
        result.get(1).add(1);
        int i =2, current , previous;



        while(i <= A)
        {
            result.add(new ArrayList<Integer>());

            result.get(i).add(1);
            for(int j =1; j < i - 1; j++)
            {
                if(j == result.get(i-1).size())
                    current = 0;
                else
                    current = result.get(i - 1).get(j);
                previous = result.get(i-1).get(j -1);

                result.get(i).add(current + previous);
            }

            result.get(i).add(1);

            i += 1;

        }

        result.remove(0);


        return result;
    }

