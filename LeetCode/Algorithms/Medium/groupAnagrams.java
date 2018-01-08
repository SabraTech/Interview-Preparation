public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        Arrays.sort(strs);
        for(String s : strs){
            String sorted = sortString(s);

            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }else{
                ArrayList<String> a = new ArrayList<String>();
                a.add(s);
                map.put(sorted, a);
            }
        }
        result.addAll(map.values());
        return result;

    }

    public String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}
