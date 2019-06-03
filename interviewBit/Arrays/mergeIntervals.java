 public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval)
    {
        if(intervals.isEmpty())
        {
            intervals.add(newInterval); return intervals;
        }

        if(newInterval.end < intervals.get(0).start )   {    intervals.add(0,newInterval); return intervals;     }

        if(intervals.get(intervals.size()-1).end < newInterval.start)   {  intervals.add(newInterval);   return intervals;   }




        Interval current; int index = 0;
        for(int i =0; i < intervals.size(); i++)
        {
            current = intervals.get(i);
            if(current.start <= newInterval.start && current.end >= newInterval.end)  {       index = i; break; }
            if(newInterval.start <= current.start && current.end <= newInterval.end) {       index = i; break; }
            if(current.start <= newInterval.start && current.end >= newInterval.start) {       index = i; break; }
            if(newInterval.start <= current.start && newInterval.end <= current.end){       index = i; break; }
        }


        Interval a,b;
        if(index == intervals.size()- 1)
        {
            for(int i = 0; i < intervals.size() -1; i++)
            {
                a = intervals.get(i); b = intervals.get(i+1);
                if(newInterval.start > a.end && newInterval.end < b.start)
                {
                    intervals.add(i+1,newInterval); break;
                }
            }
        }






        int temp = index;
        for(; index < intervals.size(); index++)
        {
            current = intervals.get(index);

            //check if current can be merged
            if(newInterval.end < current.start)
                break;

            // new interval is subset of current
            if(newInterval.start >= current.start && newInterval.end <= current.end)
            {
                break;
            }


            //current is subset of new interval
            if(newInterval.start <= current.start && newInterval.end >= current.end)
            {
                current.start = newInterval.start; current.end = newInterval.end;
                newInterval = current;
                continue;
            }

            if(newInterval.end >= current.start && newInterval.end <= current.end)
            {
                current.start = newInterval.start; newInterval = current;
                continue;
            }

            if(newInterval.start >= current.start && newInterval.start <= current.end)
            {
              current.end = newInterval.end; newInterval = current;
            }



        }


       for(; temp < intervals.size() - 1; temp++)
       {
           current = intervals.get(temp);
           newInterval = intervals.get(temp + 1);

           if(current.start >= newInterval.start && current.end <= newInterval.end)
           {
               intervals.remove(temp);
               temp -= 1;
           }
       }


        return intervals;

    }