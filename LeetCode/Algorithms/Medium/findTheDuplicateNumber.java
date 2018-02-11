class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)){
                return n;
            }
            set.add(n);
        }
        return -1;
    }
}
