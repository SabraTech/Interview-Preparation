int arrayMaximalAdjacentDifference(int[] inputArray) {
    int diff = Integer.MIN_VALUE;
    int currDiff;
    for(int i = 0; i < inputArray.length - 1; i++){
        currDiff = Math.abs(inputArray[i] - inputArray[i+1]);
        if(currDiff > diff){
            diff = currDiff;
        }
    }
    return diff;
}
