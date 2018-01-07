int missingNumber(int[] arr) {
    Arrays.sort(arr);
    int i;
    for(i = 0; i < arr.length; i++){
        if(i != arr[i]){
            break;
        }
    }
    return i;
}

// OR

int missingNumber(int[] arr) {
    int len = arr.length;
    int expectedSum = (len + 1) / 2 * len;
    int actualSum = 0;
    for(int i = 0; i < arr.length; i++){
        actualSum += arr[i];
    }
    return expectedSum - actualSum;
}
