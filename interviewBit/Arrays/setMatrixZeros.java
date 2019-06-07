     public  ArrayList<ArrayList<Integer>>  rowZeroes(ArrayList<ArrayList<Integer>> a, HashSet<Integer> rowSet, int row)
    {
 
        if(rowSet.contains(row))
            return a;
 
 
        for(int j =0; j < a.get(0).size(); j++)
            a.get(row).set(j,0);
 
 
 
        rowSet.add(row);
        return a;
    }
 
    public  ArrayList<ArrayList<Integer>> colZeroes(ArrayList<ArrayList<Integer>> a, HashSet<Integer> colSet, int col)
    {
 
        if(colSet.contains(col))
            return a;
 
        for(int i =0; i < a.size(); i++)
            a.get(i).set(col,0);
 
 
 
        colSet.add(col);
        return a;
    }
    
    public  void setZeroes(ArrayList<ArrayList<Integer>> a)
    {
        HashSet<Integer> rowSet = new HashSet<Integer>();
        HashSet<Integer> colSet = new HashSet<Integer>();
 
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
 
 
        for(int i =0; i < a.size(); i++)
        {
            for(int j = 0; j <a.get(0).size(); j++)
            {
                if(a.get(i).get(j) == 0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
 
 
 
        for(int i =0; i < rows.size(); i++)
        {
            a = rowZeroes(a,rowSet,rows.get(i));
            a = colZeroes(a, colSet,cols.get(i));
        }
        
        
    }
