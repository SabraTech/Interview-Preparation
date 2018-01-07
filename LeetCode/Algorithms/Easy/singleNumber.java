public class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        for(int i=0;i<nums.length;i++){
            r = r ^ nums[i];
        }
        return r;
    }
}
