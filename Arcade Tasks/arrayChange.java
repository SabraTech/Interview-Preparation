int arrayChange(int[] inputArray) {
    int ans = 0;
    for (int i = 1; i < inputArray.length; i++) {
      if (inputArray[i] <= inputArray[i - 1]) {
        ans += inputArray[i - 1] - inputArray[i] + 1;
        inputArray[i] = inputArray[i-1] + 1;
      }
    }
    return ans;
}
