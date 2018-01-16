class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
	    int len2 = num2.length();
        int[] prod = new int[len1 + len2];

        for(int i = len1 - 1; i >= 0; i--){
	        int n1 = num1.charAt(i) - '0';
	        for(int j = len2 - 1; j >= 0; j--){
	            int index = len1 + len2 - i - j - 2;
	            int n2 = num2.charAt(j) - '0';
	            int num = n1 * n2 + prod[index];
	            prod[index + 1] += num / 10;
	            prod[index] = num % 10;
	        }
	    }

        StringBuilder sb = new StringBuilder();
	    int i = len1 + len2 -1;

        while(i >= 0 && prod[i] == 0){
	        i--;
    	}

        while(i >= 0){
	        sb.append(prod[i--]);
	    }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
