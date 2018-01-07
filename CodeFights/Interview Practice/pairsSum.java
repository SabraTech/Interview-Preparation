int pairsSum(int[] a) {
    Map<Integer, Integer> table = new HashMap<Integer, Integer>();
    int sum = 0, count = 0;
    for(int i = 0; i < a.length; i++){
        table.put(a[i],0);
    }
    for(int i = 0;i < a.length - 1;i++){
        int x = a[i];
        for(int j = i +1 ;j < a.length;j++){
            int cur = a[j];
            sum = x + cur;
            if(table.containsKey(sum)){
                table.put(x,table.get(x) + 1);
            }
        }
    }
    for(Map.Entry<Integer, Integer> entry : table.entrySet()){
        count += entry.getValue();
    }
    return count;

}

// Or

int pairsSum(int[] a) {
    int numOfPairs = 0;
    Arrays.sort(a);
    for(int i = 0 ; i < a.length ; i ++){
        int j = 0 , l = 0;
        while(j < i && l < a.length){
            if(a[l] < a[i] + a[j])l++;
            else if(a[l] > a[i]+a[j])j++;
            else{
                numOfPairs++;
                j++;
            }
        }
    }
    return numOfPairs;
}
