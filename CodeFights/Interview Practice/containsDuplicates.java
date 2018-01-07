boolean containsDuplicates(int[] a) {
    Set<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < a.length; i++){
        set.add(a[i]);
    }
    return set.size() != a.length;
}
