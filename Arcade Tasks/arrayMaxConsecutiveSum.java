int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int result = 0, currentSum = 0;
    for (int i = 0; i < k-1; i++) {
      currentSum += inputArray[i];
    }
    for (int i = k - 1; i < inputArray.length; i++) {
      currentSum += inputArray[i];
      if (currentSum > result) {
        result = currentSum;
      }
      currentSum -= inputArray[i - k + 1];
    }
    return result;
}
