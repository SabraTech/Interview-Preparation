class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<List<String>>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String word: strs){
            char[] k = word.toCharArray();
            Arrays.sort(k);
            String key = new String(k);
            if(!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            } else {
                map.get(key).add(word);
            }
        }
        return new ArrayList(map.values());
    }
}
