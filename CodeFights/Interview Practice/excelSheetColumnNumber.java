int excelSheetColumnNumber(String s) {
    int ans = 0;
	for(int i = 0; i < s.length(); i++){
	    char ch = s.charAt(i);
	    ans = ans * 26 + (ch - 'A' + 1);
	}
	return ans;
}
