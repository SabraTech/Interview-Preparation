int[] removeArrayPart(int[] inputArray, int l, int r) {
    int[] ans = new int[inputArray.length - (r + 1 - l)];
    int k = 0;
    for(int i = 0; i < inputArray.length; i++){
        if(i >= l && i <= r){
            continue;
        }
        ans[k++] = inputArray[i];
    }
    return ans;
}
