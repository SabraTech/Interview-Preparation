int[] removeArrayPart(int[] inputArray, int l, int r) {
    int[] ans = new int[inputArray.length - (r + 1 - l)];
    int k = 0;
    for(int i = 0; i < l; i++){
        ans[k++] = inputArray[i];
    }
    for(int i = r + 1; i < inputArray.length; i++){
        ans[k++] = inputArray[i];
    }
    return ans;
}
