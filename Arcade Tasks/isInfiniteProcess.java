boolean isInfiniteProcess(int a, int b) {
    if(b >= a && (b-a) % 2 == 0){
        return false;
    }else{
        return true;
    }

}
