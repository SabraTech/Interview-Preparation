public class Solution {
    public boolean isAnagram(String s1, String s2) {
        if(s1 == null || s2 == null){
    return false; // error
  }
  if(s1.length() != s2.length()){
    return false;
  }
  int[] letters = new int[26];
  for(int i = 0; i < s1.length(); i++){
    letters[s1.charAt(i) - 'a']++;
  }
  for(int i = 0; i < s1.length(); i++){
    letters[s2.charAt(i) - 'a']--;
  }
  for(int i = 0; i < 26; i++){
    if(letters[i] != 0){
      return false;
    }
  }
  return true;
    }
}
