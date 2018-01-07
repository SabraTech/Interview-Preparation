boolean almostIncreasingSequence(int[] sequence) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i : sequence){
        if(list.size() == 0 || i > list.get(list.size() - 1)){
            list.add(i);
        }else{
            int j = 0;
            int k = list.size() - 1;

            while(j < k){
                int mid = (j + k) / 2;
                if(list.get(mid) < i){
                    j = mid + 1;
                }else{
                    k = mid;
                }
            }
            list.set(k, i);
        }
    }
    if(sequence.length - list.size() > 1){
        return false;
    }else{
        return true;
    }
}
