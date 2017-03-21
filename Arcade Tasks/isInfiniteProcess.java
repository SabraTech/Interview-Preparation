boolean isInfiniteProcess(int a, int b) {
    if(b-a > 1 && a * 2 != b){
        return false;
    }else if(a == b){
        return false;
    }else{
        return true;
    }

}
