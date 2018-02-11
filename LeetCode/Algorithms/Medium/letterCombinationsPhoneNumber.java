class Solution {
    public List<String> letterCombinations(String digits){
    HashMap<Character, String> map = new HashMap<>();
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");
    map.put('0', "");

    List<String> result = new ArrayList<>();
    if(digits.equals("")){
	return result;
    }
    helper(result, new StringBuilder(), digits, 0, map);
    return result;
}


public void helper(List<String> result, StringBuilder sb, String digits, int index ,HashMap<Character, String> map){
    if(index >= digits.length()){
        result.add(sb.toString());
        return;
    }

    char c = digits.charAt(index);
    String value = map.get(c);

    for(int i=0; i < value.length(); i++){
        sb.append(value.charAt(i));
        helper(result, sb, digits, index + 1, map);
        sb.deleteCharAt(sb.length()-1);
    }
}
}
