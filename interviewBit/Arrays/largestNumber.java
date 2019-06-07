 public  String largestNumber(final List<Integer> A)
    {
       int a=A.size();
        String arr[]=new String[a];
        for(int i=0;i<a;i++)
            arr[i]=String.valueOf(A.get(i));
        
        Arrays.sort(arr,new Comparator<String>() {
            public int compare(String a,String b){
                return (b+a).compareTo(a+b);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        if(sb.charAt(0)=='0' && sb.length()>1){
            return String.valueOf(0);
        }
        return sb.toString();
    }
