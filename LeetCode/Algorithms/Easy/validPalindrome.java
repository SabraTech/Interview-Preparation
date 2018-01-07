public class Solution {
       public boolean isPalindrome(String s){
		if(s==null){
		   return false;
		}


		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		for(int i = 0; i < s.length() ; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				return false;
			}
		}

		return true;
	}
}
