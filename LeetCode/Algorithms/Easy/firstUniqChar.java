public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> table = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(table.containsKey(c)){
                table.put(c,table.get(c)+1);
            }else{
                table.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(table.get(c) == 1){
                return i;
            }
        }
        return -1;
    }
}
