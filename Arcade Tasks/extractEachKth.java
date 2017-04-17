int[] extractEachKth(int[] inputArray, int k) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    int j = 1;
    for(int i = 0; i < inputArray.length; i++){
        if(j == k){
            j = 1;
            continue;
        }else{
            j++;
            ans.add(inputArray[i]);
        }
    }
    int[] result = new int[ans.size()];
    for(int i = 0; i < ans.size(); i++){
        result[i] = ans.get(i);
    }
    return result;
}
