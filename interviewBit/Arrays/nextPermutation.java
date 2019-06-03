public void nextPermutation(ArrayList<Integer> a) {
        
        
        boolean flag=true;
        for(int i=a.size()-1;i>0;i--){
            if(a.get(i)>a.get(i-1)){
                flag=false;
                //Collections.sort(yourList.subList(1, yourList.size()));
            Collections.sort(a.subList(i, a.size()));
                int t=a.get(i-1);
                
                for(int j=i;j<a.size();j++){
                    if(a.get(j)>t){
                        
                        Collections.swap(a,j,i-1);
                        return;
                    }
                    
                }
                
                
            }
            
            
            
            
        }
        if(flag)
        Collections.sort(a);
        
    }