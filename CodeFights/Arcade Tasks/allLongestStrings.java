String[] allLongestStrings(String[] inputArray) {
    int max = inputArray[0].length();
    for(int i = 1; i < inputArray.length; i++){
        if(max < inputArray[i].length()){
            max = inputArray[i].length();
        }
    }
    ArrayList<String> res = new ArrayList<String>();
    for(String s : inputArray){
        if(s.length() == max){
            res.add(s);
        }
    }
    String[] ans = new String[res.size()];
    ans = res.toArray(ans);
    return ans;
}
