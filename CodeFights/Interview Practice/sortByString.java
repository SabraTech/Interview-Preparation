String sortByString(String s, String t) {
    int head = 0;
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    for(char c : tArr){
        for(int i = head; i < sArr.length; i++){
            if(sArr[i] == c){
                char temp = sArr[head];
                sArr[head] = sArr[i];
                sArr[i] = temp;
                head++;
            }
        }
    }
    String ans = new String(sArr);
    return ans;
}
