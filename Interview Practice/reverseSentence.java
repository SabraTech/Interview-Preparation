String reverseSentence(String sentence) {
    String[] parts = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i = parts.length - 1; i >= 0; i--){
        sb.append(parts[i]);
        sb.append(" ");
    }
    sb.setLength(sb.length() - 1);
    return sb.toString();

}

// OR

String reverseSentence(String a) {
	  String[] parts = a.split(" ");
	  List<String> words = new ArrayList<>();
	  for(String word : parts){
	      if(!word.isEmpty()){
	          words.add(0,word);
	      }
	  }
    return String.join(" ", words);
	}
