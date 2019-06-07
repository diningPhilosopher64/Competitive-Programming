    public int isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        
        if(A < 2)
            return 0;
        if(A == 2) 
            return 1;
        
        for (int i = 2; i <= upperLimit; i++) {
            if (A % i == 0) return 0;
        }
        return 1;
    }
