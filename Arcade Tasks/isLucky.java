boolean isLucky(int n) {
    int temp = n;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    do{
        arr.add(temp % 10);
        temp /= 10;
    } while  (temp > 0);
    Collections.reverse(arr);
    int sum1 = 0, sum2 = 0;
    for(int i = 0, j = arr.size() - 1; i < arr.size() / 2; i++, j--){
        sum1 += arr.get(i);
        sum2 += arr.get(j);
    }
    if(sum1 == sum2){
        return true;
    }else{
        return false;
    }
}
