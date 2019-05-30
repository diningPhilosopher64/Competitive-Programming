//https://www.interviewbit.com/problems/anti-diagonals/
//

  public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();



        int i, j, cr, cc;
        i = 0; j = 0;
        int current = 0;
        while(j < A.size())
        {


            result.add(new ArrayList<Integer>());

            cr = i; cc = j;
            while(cc >= 0)
            {
                result.get(current).add(A.get(cr).get(cc));
                cc -= 1; cr += 1;
            }

            current +=1;
            j += 1;
        }


        i = 1; j = A.get(0).size() - 1;
        while(i < A.size())
        {
            result.add(new ArrayList<Integer>());
            cr = i;
            cc = j;

            while (cr < A.size())
            {
                result.get(current).add(A.get(cr).get(cc));
                cc -= 1;
                cr += 1;
            }

            i += 1;
            current +=1;

        }


        return result;

    }
