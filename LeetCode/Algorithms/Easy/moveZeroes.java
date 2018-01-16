public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        while(cnt < nums.length){
            nums[cnt] = 0;
            cnt++;
        }

    }
}
