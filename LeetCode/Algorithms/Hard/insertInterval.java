/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

class Interval{
    int start, end;
    Interval(){
        start = 0;
        end = 0;
    }
    Interval(int s, int e){
        start = s;
        end = e;
    }
}

public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();

        for(Interval i : intervals){
            if(i.end < newInterval.start){
                result.add(i);
            }else if(i.start > newInterval.end){
                result.add(newInterval);
                newInterval = i;
            }else if(i.end >= newInterval.start || i.start <= newInterval.end){
                newInterval = new Interval(Math.min(i.start,newInterval.start),Math.max(i.end,newInterval.end));
            }
        }

        result.add(newInterval);
        return result;

    }

}
