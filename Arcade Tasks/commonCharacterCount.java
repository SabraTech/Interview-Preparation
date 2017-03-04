int commonCharacterCount(String s1, String s2) {
    int ans = 0;
    s1 = sortString(s1);
    s2 = sortString(s2);
    int index1 = 0, index2 = 0;
    while((index1 < s1.length()) && (index2 < s2.length())) {
      if(s1.charAt(index1) == s2.charAt(index2)) {
        ans++;
        index1++;
        index2++;
      } else if(s1.charAt(index1)> s2.charAt(index2)) {
          index2++;
      } else {
          index1++;
      }
    }
    return ans;
}

String sortString(String s){
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    String ans = new String(arr);
    return ans;
}
