int differentSymbolsNaive(String s) {
    Set<Character> set = new HashSet<Character>();
    for(int i = 0; i < s.length(); i++){
        set.add(s.charAt(i));
    }
    return set.size();
}
