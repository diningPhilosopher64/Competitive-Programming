public  static int maxSpecialProduct(ArrayList<Integer> A)
    {
        int mod = 1000000007;
        int[] arr = new int[A.size()];
        ArrayList<Integer> rMax = new ArrayList<Integer>(Collections.nCopies(A.size(),0));
        ArrayList<Integer> lMax = new ArrayList<Integer>(Collections.nCopies(A.size(),0));
 
        Stack<Integer> stack = new Stack<>();
        int current = 0, top;
        for(int i = 0; i < A.size(); i++)
        {
            current = A.get(i);
            if(stack.isEmpty())
            {
                stack.push(i); continue;
            }
            top = stack.peek();
            while(current > A.get(top) && !stack.isEmpty())
            {
                rMax.set(top,i);
                stack.pop();
                if(!stack.isEmpty())
                top = stack.peek();
            }
            stack.push(i);
        }
 
        // Last element rMax is 0
        rMax.set(rMax.size() - 1, 0);
        while(!stack.isEmpty())
            rMax.set(stack.pop(), 0);
 
        stack.clear();
 
        lMax.set(0,0);
        for(int i =A.size() - 1; i > 0; i--)
        {
            current = A.get(i);
            if(stack.isEmpty())
            {
                stack.push(i); continue;
            }
 
            top = stack.peek();
            while(current > A.get(top) && !stack.isEmpty() )
            {
                lMax.set(top,i);
                stack.pop();
                if(!stack.isEmpty())
                top = stack.peek();
 
            }
 
            stack.push(i);
        }
 
        while(!stack.isEmpty())
            lMax.set(stack.pop(), 0);
 
 
 
        BigInteger currentProduct, maxProduct = BigInteger.valueOf(-1);
        for(int i =0; i < rMax.size(); i++)
        {
            currentProduct = BigInteger.valueOf(lMax.get(i)).multiply(BigInteger.valueOf(rMax.get(i)));
 
            if (currentProduct.compareTo(maxProduct) > 0)
                maxProduct = currentProduct;
        }
 
 
        long bla  = maxProduct.longValue() % mod;
 
        return (int)bla;
    }
