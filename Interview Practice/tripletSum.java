boolean tripletSum(int x, int[] a) {
    Arrays.sort(a);
    for(int i = 0; i < a.length - 1; i++){
        boolean ans = twoSum(a, x - a[i], i + 1);
        if(ans){
            return true;
        }
    }
    return false;
}

boolean twoSum(int[] arr, int x, int low){
    int high = arr.length - 1;
    while(low < high){
        if(arr[low] + arr[high] == x){
            return true;
        }
        if(arr[low] + arr[high] > x){
            high--;
        }else{
            low++;
        }
    }
    return false;
}
