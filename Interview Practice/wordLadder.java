class WordNode{
    String word;
    int numSteps;

    public WordNode(String word, int numSteps){
        this.word = word;
        this.numSteps = numSteps;
    }

    public String getWord(){
        return this.word;
    }

    public int getSteps(){
        return this.numSteps;
    }
}

int wordLadder(String beginWord, String endWord, String[] wordList) {
    boolean found = false;
    for(String s : wordList){
        if(s.equals(endWord)){
            found = true;
        }
    }
    if(!found){
        return 0;
    }
    Queue<WordNode> queue = new LinkedList<WordNode>();
    queue.add(new WordNode(beginWord, 1));

    Set<String> wordDict = new HashSet<String>(Arrays.asList(wordList));
    wordDict.add(endWord);

    while(!queue.isEmpty()){
        WordNode top = queue.remove();
        String word = top.getWord();

        if(word.equals(endWord)){
            return top.getSteps();
        }

        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length; i++){
            for(char c = 'a'; c <= 'z'; c++){
                char temp = arr[i];
                if(arr[i] != c){
                    arr[i] = c;
                }
                String newWord = new String(arr);
                if(wordDict.contains(newWord)){
                    queue.add(new WordNode(newWord, top.getSteps()+1));
                    wordDict.remove(newWord);
                }
                arr[i] = temp;
            }
        }
    }
    return 0;
}
