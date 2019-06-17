//https://www.interviewbit.com/problems/prime-sum/


public ArrayList<Integer> sieve(int A)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(A <= 1)
            return result;

        if(A == 2)
            {
                result.add(2); return result;
            }

        int limit, flag ;
        for(int i = 2; i <= A; i++ )
        {
            limit = (int)Math.sqrt(i);
            flag = 0;
            for(int j = 2; j<= limit; j++)
            {
                if(i%j == 0)
                {
                    flag =1; break;
                }
            }

            if(flag == 0)
                result.add(i);
        }

        return result;

    }

    public ArrayList<Integer> primesum(int A)
    {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> listOfPrimes = new ArrayList<>();
        if(A == 2)
            return result;


        listOfPrimes = sieve(A/2);

        int current, truth = 0;
        for(int i =0; i < listOfPrimes.size(); i++)
        {
            current = listOfPrimes.get(i);

            if(isPrime(A - current) == 1)
            {
                result.add(current); result.add(A-current);
                break;
            }


        }
        return result;
    }
