public class Solution {
    public int missingNumber(int[] nums) {
            int sum  = 0;
        int n = nums.length;
        int originalSum = n*(n+1)/2;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }

        return originalSum - sum;
    }
}
