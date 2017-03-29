String reverseParentheses(String s) {
    int r, l;
    while((l = s.lastIndexOf('('))>=0){
        r = s.indexOf(')',l);
        s = s.replace(s.substring(l,r+1),new StringBuffer(s.substring(l+1,r)).reverse());

    }
    return s;
}
