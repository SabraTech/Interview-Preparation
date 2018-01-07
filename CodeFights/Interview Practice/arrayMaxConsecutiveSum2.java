int arrayMaxConsecutiveSum2(int[] inputArray) {
    int ans = inputArray[0], sum = 0, minSum = 0;
    for(int i = 0; i < inputArray.length; i++){
        sum += inputArray[i];
        if(sum - minSum > ans){
            ans = sum - minSum;
        }
        if(sum < minSum){
            minSum = sum;
        }
    }
    return ans;
}

