int countVowelConsonant(String s) {
    HashMap vowels = new HashMap();
    vowels.put(1,'a');
    vowels.put(2,'e');
    vowels.put(3,'i');
    vowels.put(4,'o');
    vowels.put(5,'u');
    int sum = 0;
    for(int i = 0;i<s.length();i++){
        char c = s.charAt(i);
        if(vowels.containsValue(c)){
            sum++;
        }else{
            sum += 2;
        }
    }
    return sum;
}
