char firstDigit(String inputString) {
    for(int i = 0; i < inputString.length(); i++){
        char c = inputString.charAt(i);
        if(c >= '0' && c <= '9'){
            return c;
        }
    }
    return '-';
}
