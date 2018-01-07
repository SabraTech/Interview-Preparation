int firstDuplicate(int[] a) {
	HashSet<Integer> set = new HashSet<>();
	for(int i = 0; i < a.length; i++){
		if(set.add(a[i]) == false){
			return a[i];  
       		}
	}
	return -1;
}
