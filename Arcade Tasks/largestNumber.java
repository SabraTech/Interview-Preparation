int largestNumber(int n) {
    StringBuffer sb = new StringBuffer();
    for(int i = 0; i < n; i++){
        sb.append("9");
    }
    return Integer.parseInt(sb.toString());
}
