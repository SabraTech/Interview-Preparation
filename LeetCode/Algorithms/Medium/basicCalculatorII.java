class Solution {
    public int calculate(String expression) {
        Stack<Integer> values = new Stack<>();
	    Stack<Character> ops = new Stack<>();
	    for(int i = 0; i < expression.length(); i++){
		    if(expression.charAt(i) == ' '){
			    continue;
		    }

		    if(expression.charAt(i) >= '0' && expression.charAt(i) <= '9'){
			    StringBuilder sb = new StringBuilder();
			    while(i < expression.length() && expression.charAt(i) >= '0' && expression.charAt(i) <= '9'){
				    sb.append(expression.charAt(i++));
			    }
                i--;
			    values.push(Integer.parseInt(sb.toString()));
		    } else if(expression.charAt(i) == '('){
			    ops.push(expression.charAt(i));
		    } else if(expression.charAt(i) == ')'){
			    while(ops.peek() != '('){
				    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
			    }
			    ops.pop();
		    } else if(expression.charAt(i) == '+' || expression.charAt(i) == '-'|| expression.charAt(i) == '*' || expression.charAt(i) == '/'){
                while(!ops.empty() && hasPrecedence(expression.charAt(i), ops.peek())){
				    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
			    }
			    ops.push(expression.charAt(i));
		    }
	    }

	    while(!ops.empty()){
		    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	    }

	    return values.pop();
    }

    private boolean hasPrecedence(char op1, char op2){
	    if(op2 == '(' || op2 == ')'){
		    return false;
	    } else if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')){
		    return false;
	    } else return true;
    }

    private int applyOp(char op, int b, int a){
	    switch(op){
		    case '+':
			    return a + b;
		    case '-':
			    return a - b;
            case '*':
			    return a * b;
		    case '/':
			    if(b == 0){
				    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
		    default:
			    return 0;
	    }
    }
}
