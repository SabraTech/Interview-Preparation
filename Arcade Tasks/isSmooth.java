boolean isSmooth(int[] arr) {
    int middle;
    if(arr.length % 2 == 0){
        middle = arr[(arr.length - 1) / 2] + arr[(arr.length - 1) / 2 + 1];
    }else{
        middle = arr[(arr.length - 1) / 2];
    }
    int first = arr[0];
    int last = arr[arr.length - 1];
    return middle == first && middle == last;
}
