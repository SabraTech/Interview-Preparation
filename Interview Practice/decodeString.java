// not complete yet needed changes 9/16 test passes
String decodeString(String s) {
    StringBuilder sb = new StringBuilder();
    int i = 0, num = 0;
    while(i < s.length()){
        char c = s.charAt(i);
        if(c >= '0' && c <= '9'){
            num = Character.getNumericValue(c);
        }else if(c == '['){
            int j = i + 1;
            char p = s.charAt(j);
            StringBuilder temp = new StringBuilder();
            while(p != ']'){
                temp.append(p);
                p = s.charAt(++j);
            }
            i = j;
            while(num > 0){
                sb.append(temp.toString());
                num--;
            }
        }else{
            sb.append(c);
        }
        i++;
    }
    return sb.toString();
}
