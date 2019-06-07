    public int solve(ArrayList<String> A) {
        ArrayList<Float> al = new ArrayList<Float>(); 
        float min1=2,min2=2;
        for(int i=0;i<A.size();i++){
            
            float f = Float.parseFloat(A.get(i));
            al.add(f);
            if(f<min1)
                min1=f;
        }
        for(int i=0;i<A.size();i++){
            if (al.get(i)>min1 && al.get(i)<min2)
                min2=al.get(i);
        }
        float x=min1+min2;
        for(int i=0;i<al.size();i++){
            if(al.get(i)+x >=2)
                al.remove(i--);
        }
        if(al.size()<3)
            return 0;
        float max1=0,max2=0,max3=0;
        for(int i=0;i<al.size();i++){
            if(max1<al.get(i))
                max1=al.get(i);
        }
        if(max1>=1)
            return 1;
        for(int i=0;i<al.size();i++){
            if(al.get(i)<max1 && max2<al.get(i) )
                max2=al.get(i);
        }
        if((max1+max2)>=1)
            return 1;
        for(int i=0;i<al.size();i++){
            if(al.get(i)<max2 && max3<al.get(i) )
                max3=al.get(i);
        }
        if((max1+max2+max3)>=1)
            return 1;
        return 0;
    }
