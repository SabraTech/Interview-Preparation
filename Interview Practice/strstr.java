int strstr(final String haystack, final String needle) {
	int startIndex = 0;
  int lenOfNeedle = needle.length();
  for (int i = 0; i <= haystack.length() - needle.length(); i++) {
		startIndex = i;
    int j = 0;
    while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
			i++;
      j++;
    }
    if (j == lenOfNeedle) {
			return startIndex;
    }
    i = startIndex;
  }
  return -1;
}
