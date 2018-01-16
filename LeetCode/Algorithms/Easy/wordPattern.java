public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");

        if(pattern.length() != arr.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<Character, String>();

        for(int i=0;i<arr.length;i++){
            char c = pattern.charAt(i);
            String s = arr[i];

            if(map.containsKey(c)){
                if(!map.get(c).equals(s)){
                    return false;
                }
            }else{
                if(map.containsValue(s)){
                    return false;
                }
                map.put(c,s);
            }
        }
        return true;
    }
}
