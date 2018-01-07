int kthLargestElement(int[] nums, int k) {
    k = k - 1;
    Arrays.sort(nums);
    return nums[nums.length - 1 - k];
}
