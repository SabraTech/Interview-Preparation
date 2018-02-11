class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(!map.containsKey(n)){
                int left = map.containsKey(n - 1) ? map.get(n - 1) : 0;
                int right = map.containsKey(n + 1) ? map.get(n + 1) : 0;
                int sum = left + right + 1;
                map.put(n, sum);
                result = Math.max(result, sum);
                map.put(n - left, sum);
                map.put(n + right, sum);
            }else{
                continue;
            }
        }
        return result;
    }
}
