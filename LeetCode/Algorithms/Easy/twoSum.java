class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        if(nums == null || nums.length < 2){
            return ans;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
