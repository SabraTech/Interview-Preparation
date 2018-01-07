String reverseVowelsOfString(String s) {
    Set<Character> vowels = new HashSet<Character>();
    StringBuilder vString = new StringBuilder();
    StringBuilder ans = new StringBuilder();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    vowels.add('A');
    vowels.add('E');
    vowels.add('I');
    vowels.add('O');
    vowels.add('U');
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(vowels.contains(c)){
            vString.append(c);
        }
    }
    for(int i = 0, j = vString.length() - 1; i < s.length(); i++){
        char c = s.charAt(i);
        if(vowels.contains(c)){
            ans.append(vString.charAt(j));
            j--;
        }else{
            ans.append(c);
        }
    }
    return ans.toString();

}
