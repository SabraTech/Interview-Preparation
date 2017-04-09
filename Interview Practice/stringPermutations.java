String[] stringPermutations(String s) {
    Set<String> ans = new TreeSet<String>();
    helper("", s, ans);
    String[] res = new String[ans.size()];
    res = ans.toArray(res);
    return res;

}

void helper(String prefix, String str, Set<String> ans){
    int n = str.length();
    if (n == 0) ans.add(prefix);
    else {
        for (int i = 0; i < n; i++)
            helper(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), ans);
    }
}

// Or

String[] stringPermutations(String s) {
    HashMap<Character , Integer> charFreq = new HashMap<>();
    char[] word = s.toCharArray();
    for(char c : word){
        if(charFreq.containsKey(c) == false)
            charFreq.put(c , 0);
        charFreq.put(c , charFreq.get(c) + 1);
    }
    ArrayList<String> answer = new ArrayList();
    stringPermutationsHelper(word,charFreq,"",answer , s.length());
    String[] answerArray = new String[answer.size()];
    for(int i = 0 ; i < answer.size() ; i ++)
        answerArray[i] = answer.get(i);
    return answerArray;

}

private void stringPermutationsHelper(char[] word , HashMap<Character,Integer>
charFreq , String perm,ArrayList<String> answer , int stringSize){
    if(perm.length() == stringSize){
        answer.add(perm);
        return;
    }
    for(char i = 'A' ; i <= 'Z' ; i ++){
        if(charFreq.containsKey(i)){
            if(charFreq.get(i) > 0){
                charFreq.put( i , charFreq.get(i) - 1);
                stringPermutationsHelper(word,charFreq,perm + i , answer , stringSize);
                charFreq.put( i , charFreq.get(i) + 1);
            }
        }
    }
}
