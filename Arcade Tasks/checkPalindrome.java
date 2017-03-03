boolean checkPalindrome(String inputString) {
    int n = inputString.length();
    for(int i = 0, j = n-1; i < n / 2; i++, j--) {
        if(inputString.charAt(i) != inputString.charAt(j)){
            return false;
        }
    }
    return true;
}
