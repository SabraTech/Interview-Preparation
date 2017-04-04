String alphabeticShift(String inputString) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < inputString.length(); i++){
        char c = inputString.charAt(i);
        if(c == 'z'){
            c = 'a';
        }else{
            c += 1;
        }
        sb.append(c);
    }
    return sb.toString();
}
