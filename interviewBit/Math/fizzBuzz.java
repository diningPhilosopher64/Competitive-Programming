//https://www.interviewbit.com/problems/fizzbuzz/ 

public ArrayList<String> fizzBuzz(int A)
    {
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < A; i++)
        {
            if((i+1) % 5 ==0 && (i+1)%3 ==0 )
                result.add("FizzBuzz");


            else if( (i+1) % 5 == 0 )
                result.add("Buzz");

            else if( (i+1) % 3 == 0 )
                result.add("Fizz");

            else
                result.add(Integer.toString(i+1));
        }

        return result;

    }
