String[] addBorder(String[] picture) {
    int size = picture[0].length() + 1;
    ArrayList<String> answer = new ArrayList<String>();
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i <= size; ++i) {
        sb.append("*");
    }
    answer.add(sb.toString());
    for (int i = 0; i < picture.length; i++) {
        answer.add("*" + picture[i] + "*");
    }
    answer.add(sb.toString());
    String[] result = new String[answer.size()];
    result = answer.toArray(result);
    return result;
}
