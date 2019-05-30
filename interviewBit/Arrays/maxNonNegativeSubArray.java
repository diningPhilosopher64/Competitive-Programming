//https://www.interviewbit.com/problems/max-non-negative-subarray/

public ArrayList<Integer> maxset(ArrayList<Integer> A)
    {

        int left,right;

        int leftMax, rightMax, sizeMax;
        long  sumCurrent, sumMax;
        left = right = 0;
        leftMax = rightMax= -1;
        sumCurrent= 0; sumMax = 0;
        sizeMax =0;
        ArrayList<Integer> result = new ArrayList<>();
        int flag = 0;
        for(int i =0; i < A.size(); i++)
        {
            if(A.get(i) >= 0)
                {
                    flag = 1;
                    break;
                }
        }


        if(flag == 0)
            return result;

        int current;
        for(; right < A.size(); right++)
        {
            current = A.get(right);

            if(current > 0)
                sumCurrent += current;



            if(current < 0 || right == A.size() - 1)
            {
                if(sumMax < sumCurrent)
                {
                  sumMax= sumCurrent;
                  leftMax = left;
                    rightMax = right - 1;
                  if(right == A.size() - 1 && current >= 0)
                    rightMax = right;

                  sizeMax = rightMax - leftMax + 1;
                }


                else if(sumMax == sumCurrent)
                {
                    if((right - left + 1) > sizeMax)
                    {
                        leftMax = left; rightMax = right - 1;
                        if(right == A.size() - 1 && current >= 0)
                            rightMax = right;

                        sizeMax = rightMax - leftMax+ 1;
                    }

                  else if((right - left + 1) == sizeMax)
                    {
                        if(leftMax > left)
                        {
                            leftMax = left; rightMax = right - 1;
                            if(right == A.size() - 1 && current >= 0)
                                rightMax = right;

                            sizeMax = rightMax - leftMax+ 1;
                        }
                    }
                }

                sumCurrent = 0;
                left = right + 1;
                continue;
            }





    }
    if(leftMax == -1 || rightMax == -1)
            return result;

        for(int i = leftMax; i <= rightMax; i++)
            result.add(A.get(i));


        return result;


}
