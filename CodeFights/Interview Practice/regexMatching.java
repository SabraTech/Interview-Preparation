boolean regexMatching(String pattern, String test) {
    boolean check = true;
    if(pattern.charAt(0) == '^'){
        for(int i = 1, j = 0; i < pattern.length();i++,j++){
            if(pattern.charAt(i) != test.charAt(j)){
                check = false;
                break;
            }
        }
    }else if(pattern.charAt(pattern.length() - 1) == '$'){
        for(int i = pattern.length() - 2, j = test.length()-1; i >=0;i--,j--){
            if(pattern.charAt(i) != test.charAt(j)){
                check = false;
                break;
            }
        }
    }else{
        if(!test.contains(pattern)){
            check = false;
        }
    }
    return check;
}

// ----------------------------------------------------------------------------

boolean regexMatching(String pattern, String test) {
  if(pattern.startsWith("^")){
    return test.startsWith(pattern.substring(1));
  }else if(pattern.endsWith("$")){
    return test.endsWith(pattern.substring(0,pattern.length()-1));
  }else{
    return test.contains(pattern);
  }
}
