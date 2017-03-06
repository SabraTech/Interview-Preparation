boolean reachNextLevel(int experience, int threshold, int reward) {
    if(experience + reward >= threshold){
        return true;
    }else{
        return false;
    }
}
