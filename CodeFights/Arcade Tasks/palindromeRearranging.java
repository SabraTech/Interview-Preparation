boolean palindromeRearranging(String inputString) {
    int[] letters = new int[26];
    for(int i = 0; i < inputString.length(); i++){
        letters[inputString.charAt(i) - 'a']++;
    }
    int odds = 0;
    for(int i = 0; i < 26; i++){
        if(letters[i] % 2 == 1){
            odds++;
        }
    }
    if(odds % 2 == inputString.length() % 2 && odds < 2){
        return true;
    }else{
        return false;
    }
}
