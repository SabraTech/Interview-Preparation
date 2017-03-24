int productExceptSelf(int[] nums, int m) {
    int g = 0;
    int[] prodB = new int[nums.length];
    int[] prodA = new int[nums.length];
    prodB[0] = 1;
    prodA[nums.length - 1] = 1;
    for(int i = 0; i<nums.length-1; i++){
        prodB[i+1] = (nums[i] * prodB[i]) % m;
    }
    for(int i = nums.length-1; i>0; i--){
        prodA[i-1] = (nums[i] * prodA[i]) % m;
    }
    for(int i = 0; i<nums.length;i++){
        g += (prodA[i] * prodB[i])% m;
    }
    return g % m;
}
