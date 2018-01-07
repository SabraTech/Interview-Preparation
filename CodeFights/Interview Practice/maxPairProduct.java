int maxPairProduct(int[] a) {
    Set<Integer> set = new HashSet<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(-1);
    for(int i = 0; i < a.length; i++){
        set.add(a[i]);
    }
    for(int i = 0; i < a.length - 1; i++){
        for(int j = i + 1; j < a.length; j++){
            int prod = a[i] * a[j];
            if(set.contains(prod)){
                list.add(prod);
            }
        }
    }
    return Collections.max(list);
}
