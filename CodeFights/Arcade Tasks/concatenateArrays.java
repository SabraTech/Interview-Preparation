int[] concatenateArrays(int[] a, int[] b) {
    int[] ans = new int[a.length + b.length];
    int k = 0;
    for(int i = 0; i < a.length; i++){
        ans[k++] = a[i];
    }
    for(int i = 0; i < b.length; i++){
        ans[k++] = b[i];
    }
    return ans;
}
