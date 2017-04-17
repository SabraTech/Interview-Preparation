String[] textJustification(String[] a, int b) {
     ArrayList<String> ans = new ArrayList<String>();
	    if(a.length == 0 || b <= 0){
	        return a;
	    }
	    int start = 0;
	    int end = 0;
	    int i = 0;
	    int len = a.length;
	    while(i <  len){
	        int lineLen = 0;
	        while(i < len){
	            int add = a[i].length();
	            if(i != start){
	                add += 1;
	            }
	            if(lineLen + add > b){
	                break;
	            }
	            lineLen += add;
	            i++;
	        }
	        end = i - 1;
	        if(i == len){
	            ans.add(jusifyLastLine(start, end, a, b));
	        }else{
	            ans.add(jusifyLine(start, end, a, b, lineLen));
	        }
	        start = end + 1;
	    }
          String[] result = new String[ans.size()];
          result = ans.toArray(result);
	    return result;
	}

	private String jusifyLastLine(int start, int end, String[] a, int b){
	    StringBuilder sb = new StringBuilder(String.join(" ", Arrays.copyOfRange(a, start, end +1)));
	    while(sb.length() < b){
	        sb.append(" ");
	    }
	    return sb.toString();
	}

	private String jusifyLine(int start, int end, String[] a, int b, int lineLen){
	    int extra = b - lineLen;
	    if(start == end){
	        StringBuilder sb = new StringBuilder(a[start]);
	        for(int i =0;i<extra;i++){
	            sb.append(" ");
	        }
	        return sb.toString();
	    }
	    StringBuilder sb = new StringBuilder();
	    int words = end - start + 1;
	    int avg = extra / (words - 1) + 1;
	    StringBuilder spaces = new StringBuilder();
	    for(int i = 0;i<avg;i++){
	        spaces.append(" ");
	    }
	    String largeSpace = spaces.toString() + " ";
	    int lefts = extra % (words - 1);
	    int left = 0;
	    for(int i = start;i<end;i++){
	        sb.append(a[start++]);
	        if(left < lefts){
	            sb.append(largeSpace);
	            left++;
	        }else{
	            sb.append(spaces);
	        }
	    }
	    sb.append(a[end]);
	    return sb.toString();
	}
