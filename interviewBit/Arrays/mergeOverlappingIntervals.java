     public static ArrayList<Interval> merge(ArrayList<Interval> intervals)
    {
        if(intervals.isEmpty() || intervals.size() == 1)
            return intervals;
 
 
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval interval, Interval t1) {
 
                if(interval.start == t1.start)
                {
                    if(interval.end < t1.end )
                        return -1;
                    else
                        return 1;
                }
 
                else if(interval.start > t1.start)
                    return 1;
 
                else
                    return -1;
            }
        });
 
 
        Interval current, next;
        for(int i =0; i < intervals.size()-1; i++)
        {
            current = intervals.get(i); next = intervals.get(i+1);
 
            // current subset of next
            if(current.start >= next.start && current.end <= next.end)
            {
                intervals.remove(i); i -= 1; continue;
            }
 
            //next is subset of current
            if(next.start >= current.start && next.end <= current.end)
            {
                intervals.remove(i+1); i-=1; continue;
            }
 
 
            if(current.end >= next.start && current.end <= next.end)
            {
                current.end = next.end; intervals.remove(i+1);
                i-= 1; continue;
            }
 
        }
 
 
 
 
        return intervals;
    }
