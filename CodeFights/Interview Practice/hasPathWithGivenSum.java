boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    if(t == null && s == 0){
        return true;
    }
    if(t == null){
        return false;
    }
    return hasPath(t, s);
}

boolean hasPath(Tree<Integer> t, int s){
    if(t == null){
        return false;
    }
    if(t.left == null && t.right == null){
        return s == t.value;
    }
    return hasPath(t.left, s - t.value) || hasPath(t.right, s - t.value);
}

