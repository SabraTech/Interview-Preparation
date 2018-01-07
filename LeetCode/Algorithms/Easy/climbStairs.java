public class Solution {
    public int climbStairs(int n) {
        if (n<0){
            return 0;
        }

        // record unique ways for each n
        int [] unique_ways=new int[n+1];
        // start point which contains only one situation
        unique_ways[0]=1;

        // can only move 1 step , so ways is only 1
        unique_ways[1]=1;

        for (int i=2; i<n+1; i++){
            unique_ways[i]=unique_ways[i-1]+unique_ways[i-2];
        }

        return unique_ways[n];
    }
}
