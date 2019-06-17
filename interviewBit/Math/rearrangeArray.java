//https://www.interviewbit.com/problems/rearrange-array/

public class Solution {
    public void arrange(ArrayList<Integer> a)
    {

        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0; i < a.size(); i++)
            result.add(a.get(a.get(i)));

        a = result;

    }
}

