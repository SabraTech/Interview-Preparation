class Solution {
    public void sortColors(int[] nums) {
        int n1 = 0, n2 = 0, n3 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                n1++;
            }else if(nums[i] == 1){
                n2++;
            }else{
                n3++;
            }
        }

        for(int i = 0; i < n1; i++) nums[i] = 0;
        for(int i = 0; i < n2; i++) nums[n1 + i] = 1;
        for(int i = 0; i < n3; i++) nums[n1 + n2 + i] = 2;

    }
}
