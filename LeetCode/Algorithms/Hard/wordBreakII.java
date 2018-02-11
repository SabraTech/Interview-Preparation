class Solution {

    HashMap<Integer, List<String>> dp = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        int maxLen = -1;
        for(String word: wordDict){
            maxLen = Math.max(maxLen, word.length());
        }
        return addSpaces(s, wordDict, 0, maxLen);
    }

    private List<String> addSpaces(String s, List<String> wordDict, int start, int max){
        List<String> words = new ArrayList<>();
        if(start == s.length()){
            words.add("");
            return words;
        }
        for(int i = start + 1; i <= max + start && i <= s.length(); i++){
            String temp = s.substring(start, i);
            if(wordDict.contains(temp)){
                List<String> lst;
                if(dp.containsKey(i)){
                    lst = dp.get(i);
                } else {
                    lst = addSpaces(s, wordDict, i, max);
                }
                for(String str: lst){
                    words.add(temp + (str.equals("") ? "" : " ") + str);
                }
            }
        }
        dp.put(start, words);
        return words;
    }
}
