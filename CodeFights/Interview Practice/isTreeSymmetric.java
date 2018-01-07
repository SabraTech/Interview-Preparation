boolean isTreeSymmetric(Tree<Integer> t) {
    if(t==null){
        return true;
    }
	return isSymmetric(t.left, t.right);
}

boolean isSymmetric(Tree<Integer> t, Tree<Integer> t1){
    if(t==null && t1==null){
        return true;
    }
	if(t==null || t1==null){
        return false;
    }
	if(!t.value.equals(t1.value)){
        return false;
    }
	return isSymmetric(t.left, t1.right) && isSymmetric(t.right, t1.left);
}
