int[] replaceMiddle(int[] arr) {
    if(arr.length % 2 == 0){
        int l = (arr.length - 1) / 2;
        int r = (arr.length - 1) / 2 + 1;
        int middle = arr[l] + arr[r];
        int[] ans = new int[arr.length - 1];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == l){
                ans[k++] = middle;
                continue;
            }
            if(i == r){
                continue;
            }
            ans[k++] = arr[i];
        }
        return ans;
    }else{
        return arr;
    }

}
