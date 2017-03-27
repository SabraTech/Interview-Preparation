int groupsOfAnagrams(String[] words) {
   Map<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
	 for(int i = 0;i < words.length;i++){
	    char[] k = words[i].toCharArray();
	    Arrays.sort(k);
	    String nS = new String(k);
	    if(!map.containsKey(nS)){
	        ArrayList<Integer> l = new ArrayList<Integer>();
	        l.add(i+1);
	        map.put(nS,l);
	    }else{
	        ArrayList<Integer> l2 = map.get(nS);
	        l2.add(i+1);
	    }
	}
	ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()){
        ans.add(entry.getValue());
    }
    return ans.size();
}
