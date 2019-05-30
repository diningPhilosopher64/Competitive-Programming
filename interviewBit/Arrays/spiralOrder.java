// https://www.interviewbit.com/problems/spiral-order-matrix-ii/ 
 public ArrayList<ArrayList<Integer>> generateMatrix(int A) 
    {
        
        int[][] matrix = new int[A][A];


        int i =1, k =0, rows = A -1, cols = A - 1;
        int limit = (int)Math.ceil((double) A/2);
        while(k < limit)
        {


            //Row forward
            for(int j = k; j <= cols-k; j++)
                matrix[k][j] = i++;

            //column downward
            for(int j = k + 1; j < rows - k ; j++)
                matrix[j][cols -k] = i++;

            //Row backward
            for(int j = cols-k; j >= k; j--)
            {
                matrix[rows-k][j] = i++;

                if(j == k && j != 0)
                    matrix[rows-k][j] = A*A;
            }

            //Column upward
            for(int j = rows -(k + 1); j > k; j--)
                matrix[j][k] = i++;


            k += 1;
        }



        ArrayList<ArrayList<Integer>> result = new ArrayList<>();


        for(int p =0; p < A; p++)
        {
            result.add(new ArrayList<Integer>());
            for(int j= 0; j < A; j++)
                result.get(p).add(j,matrix[p][j]);
        }
        
        
        return result;
        
        
    }
