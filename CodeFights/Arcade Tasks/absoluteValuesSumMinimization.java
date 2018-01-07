int absoluteValuesSumMinimization(int[] a) {
    int curSum = Integer.MAX_VALUE;
    int index = 0;
    for(int i = 0; i < a.length; i++){
        int x = a[i];
        int sum = 0;
        for(int j = 0; j < a.length; j++){
            sum += Math.abs(a[j] - x);
        }
        if(sum < curSum){
            curSum = sum;
            index = i;
        }
    }
    return a[index];
}
