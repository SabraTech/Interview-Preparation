int sumInRange(int[] nums, int[][] queries) {
    int M = 1000000007;
    int[] sums = new int[nums.length];
    sums[0] = nums[0];
    for(int i = 1; i < nums.length; i++){
        sums[i] = (nums[i] + sums[i - 1]) % M;
    }
    int sum = 0;
    for(int i = 0; i < queries.length; i++){
        int start = queries[i][0];
        int end = queries[i][1];
        if(start == 0){
            sum += sums[end] % M;
        }else{
            sum += (sums[end] - sums[start - 1]) % M;
        }

    }
    return (sum + M) % M;

}
