public class Solution {
    public String reverseString(String s) {

        char[] arr = s.toCharArray();
        int len = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i=len-1;i>=0;i--){
            sb.append(arr[i]);
        }
        return sb.toString();

    }
}
