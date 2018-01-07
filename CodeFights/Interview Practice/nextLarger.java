int[] nextLarger(int[] a) {
    int[] ans = new int[a.length];
    Arrays.fill(ans, -1);
    Stack<Integer> stackValue = new Stack<Integer>();
    Stack<Integer> stackIndex = new Stack<Integer>();
    stackValue.push(a[0]);
    stackIndex.push(0);
    for(int i = 1; i < a.length; i++){
        while(!stackValue.empty() && a[i] > stackValue.peek()){
            int index = stackIndex.peek();
            ans[index] = a[i];
            stackValue.pop();
            stackIndex.pop();
        }
        stackValue.push(a[i]);
        stackIndex.push(i);
    }
    return ans;
}
