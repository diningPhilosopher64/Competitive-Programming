//https://www.interviewbit.com/problems/flip/

public ArrayList<Integer> flip(String A)
    {

        A = "-" + A;



        ArrayList<Integer> result = new ArrayList<>();
        int size = A.length();

        int[] zeros = new int[size];
        int[] ones = new int[size];

        if(A.charAt(1) == '0')
        {
            zeros[1] = 1;
            ones[1] = 0;
        }

        else
        {
            zeros[1] = 0;
            ones[1] = 1;
        }


        // Prefix arrays for 0's and 1's
        for(int i = 2 ; i < zeros.length ; i++)
        {
            if(A.charAt(i) == '0')
            {
                zeros[i] = zeros[i - 1] + 1;
                ones[i] = ones[i - 1];
            }

            else
            {
                zeros[i] = zeros[i - 1];
                ones[i] = ones[i - 1] + 1;
            }
        }


        int left = 1 , right = 1;
        int profit = 0, maxProfit = 0;
        int loc1 = 0, loc2 = 0;
        for(; right < size; right++)
        {
            if(A.charAt(right) == '0')
            {
                profit = zeros[right] - zeros[left] + 1 - (ones[right] - ones[left]);

                if(profit>maxProfit)
                {
                    maxProfit = profit;
                    if(result.isEmpty())
                    {
                        result.add(left); result.add(right);
                    }
                    else
                    {
                        result.set(0,left); result.set(1,right);
                    }
                }
            }

            else
            {
                profit -= 1;

                if(profit < 0)
                {
                    profit = 0;
                    left = right + 1;
                }
            }
        }

        return result;
    }
