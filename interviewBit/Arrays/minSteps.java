// https://www.interviewbit.com/problems/min-steps-in-infinite-grid/ 

public int coverPoints(int[] A, int[] B) 
    {
         int xdiff, ydiff,x1,x2,y1,y2;
        int distance = 0;
        
        
        for(int i =0; i < A.length - 1; i++)
        {
            x1 = A[i]; y1 = B[i];
            x2 = A[i + 1]; y2  = B[i+1]; 
            
            xdiff = Math.abs(x2 -x1); ydiff = Math.abs(y2-y1);
            
            distance += Math.max(xdiff,ydiff);
        
            
             
            
        }
        
        
        return distance;
        
        
    }
