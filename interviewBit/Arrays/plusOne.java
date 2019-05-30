// https://www.interviewbit.com/problems/add-one-to-number/
 

public ArrayList<Integer> plusOne(ArrayList<Integer> A) 
    {
        int pointer = A.size() - 1;
        int carry = 0,sum = 0, current = 0;


        do {

            current = A.get(pointer);

                sum = current + 1;



            if(sum > 9)
            {
                carry = 1;
                A.set(pointer,0);
                pointer -= 1;
                continue;
            }

            A.set(pointer,sum);
            carry = 0;

        }while(carry > 0 && pointer > -1);

        // Overflow Condition
        if( pointer == -1 ) 
        {
            A.add(0, 1);
            return A;
        }
        //Removing leading 0 if any
        int i =0;
        while(A.get(i) ==0)
        {
            A.remove(i);
            i += 1;
        }

            
            return A;
    }
