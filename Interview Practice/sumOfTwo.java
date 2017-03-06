boolean sumOfTwo(int[] a, int[] b, int v) {
    HashMap<Integer, Boolean> hash = new HashMap<>();
    for (int i : a){
        hash.put(v - i, true);
    }
    for (int i : b){
      if (hash.containsKey(i)){
          return true;
      }
    }
    return false;
}
