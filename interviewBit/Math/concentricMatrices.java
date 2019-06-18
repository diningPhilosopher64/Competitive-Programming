//https://www.interviewbit.com/problems/prettyprint/

public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A)
    {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < 2*A - 1; i++)
        {
            matrix.add(new ArrayList<Integer>());
            for(int j =0; j < 2*A - 1; j++)
                matrix.get(i).add(0);
        }

        int k = (int)Math.ceil((2*A - 1)/2);
        int i =0;
        int value = A;

        while(i < k)
        {
            matrix = rowFill(matrix,i,matrix.size() - i,value);
            matrix = columnFillDown(matrix,i,matrix.size() - 1 - i,matrix.size() - 1 - i,value);
            matrix = rowFillBack(matrix,matrix.size() -1 - i,i,matrix.size() -1 -i,value);
            matrix = columnFillUp(matrix, i,matrix.size() - 1- i, i ,value);

            value -= 1;
            i++;
        }

        matrix.get(A-1).set(A-1,1);

        return matrix;

    }


    // filling which row till which column
    public ArrayList<ArrayList<Integer>> rowFill(ArrayList<ArrayList<Integer>> matrix,int row, int column, int value)
    {
        for(int j = row; j < column;j++)
            matrix.get(row).set(j,value);

        return matrix;
    }


    public ArrayList<ArrayList<Integer>> rowFillBack(ArrayList<ArrayList<Integer>> matrix,int row, int fromColumn, int toColumn, int value)
    {
        for(int j = fromColumn; j <= toColumn; j++)
            matrix.get(row).set(j, value);

        return matrix;
    }

    public ArrayList<ArrayList<Integer>> columnFillDown(ArrayList<ArrayList<Integer>> matrix,int fromRow, int tillRow , int column, int value)
    {
        for(int j = fromRow; j <= tillRow;j++)
            matrix.get(j).set(column,value);

        return matrix;
    }

    public ArrayList<ArrayList<Integer>> columnFillUp(ArrayList<ArrayList<Integer>> matrix,int fromRow, int tillRow , int column, int value)
    {
        for(int j = fromRow; j <= tillRow;j++)
            matrix.get(j).set(column,value);

        return matrix;
    }
}

