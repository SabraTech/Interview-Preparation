boolean areSimilar(int[] A, int[] B) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < A.length; i++) {
      if ( A[i] != B[i] ) {
        list.add(i);
      }
    }
    if (list.size() == 0) {
      return true;
    }
    if (list.size() != 2) {
      return false;
    }
    int index1 = list.get(0);
    int index2 = list.get(1);
    if (A[index1] == B[index2] && A[index2] == B[index1]) {
      return true;
    }
    return false;
}
