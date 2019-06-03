 public void rotate(ArrayList<ArrayList<Integer>> a) 
    {
       int t1, t2;

        int size = a.size();

       for(int m =0; m <= size - 2; m++)
       {
           for(int i =m; i < size - 1 - m; i++)
           {
               t1 = a.get(i).get(size - 1 - m);
               a.get(i).set(size - 1- m, a.get(m).get(i));

               t2 = a.get(size - 1 - m ).get(size - 1- i);
               a.get(size - 1 - m).set(size - 1 - i , t1);

               t1 = a.get(size - 1 - i).get(m);
               a.get(size - 1 - i).set( m, t2);


                a.get(m).set(i,t1);

           }
           
           if(size <=3)
            break;
       }

        
    }