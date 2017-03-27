String stringReformatting(String s, int k) {
    String s2 = s.replaceAll("-", "");
    StringBuffer sb = new StringBuffer();
    int cnt = k;
    for(int i = s2.length() - 1; i >= 0; i--){
        if(cnt == 0){
            cnt = k;
            sb.append("-");
        }
        sb.append(s2.charAt(i));
        cnt--;
    }
    sb.reverse();
    return sb.toString();
}
