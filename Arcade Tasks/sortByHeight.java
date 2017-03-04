int[] sortByHeight(int[] a) {
    ArrayList<Integer> people = new ArrayList<Integer>();
    int[] ans = new int[a.length];
    for(int i = 0; i < a.length; i++){
        if(a[i] == -1){
            ans[i] = a[i];
        }else{
            people.add(a[i]);
        }
    }
    Collections.sort(people);
    int i = 0, j = 0;
    while(i < ans.length && j < people.size()){
        if(ans[i] != -1){
            ans[i] = people.get(j);
            i++;
            j++;
        }else{
            i++;
        }
    }
    return ans;
}
