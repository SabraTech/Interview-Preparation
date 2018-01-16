class MinStack {

    private Stack<Integer> stack, minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        if(minStack.isEmpty() || x <= getMin()){
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if(!stack.isEmpty()){
            int value = stack.pop();
            if(value == getMin()){
                minStack.pop();
            }
        }
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public int getMin() {
        if(minStack.isEmpty()){
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek();
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
