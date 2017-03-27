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
