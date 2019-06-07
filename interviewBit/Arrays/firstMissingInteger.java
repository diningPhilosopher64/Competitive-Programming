public int firstMissingPositive(ArrayList<Integer> A) {
        for(int i=0;i<A.size();i++){
            if(A.get(i)<=0){
                A.set(i, Integer.MAX_VALUE);
            }
            
        }
        int x=0;
        for(int i=0;i<A.size();i++){
            if( (Math.abs(A.get(i)))!=Integer.MAX_VALUE && (Math.abs(A.get(i)))>0 && (Math.abs(A.get(i)))<=A.size()){
                int ind=Math.abs(A.get(i))-1;
                int y=(-1)*A.get(ind);
                A.set(ind, y);
            }
        }
        int i=0;
        //or( i=0;i<A.size();i++)
        //System.out.println(A.get(i));
        for( i=0;i<A.size();i++){
            if(A.get(i)>=0)
                break;
        }
        return (i+1);
        }
