int maxMultiple(int divisor, int bound) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    int i = 1;
    while(true){
        if(i % divisor == 0 && i <= bound){
                ans.add(i);
        }
        if( i > bound){
            break;
        }
        i++;
    }
    return ans.get(ans.size() - 1);
}
