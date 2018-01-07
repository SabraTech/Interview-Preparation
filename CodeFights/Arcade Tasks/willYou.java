boolean willYou(boolean young, boolean beautiful, boolean loved) {
    if(young && beautiful && !loved){
        return true;
    }
    if(loved && (!young || !beautiful)){
        return true;
    }
    return false;
}
