int[] metroCard(int lastNumberOfDays) {
    if(lastNumberOfDays == 28){
        return new int[]{31};
    }else if(lastNumberOfDays == 30){
        return new int[]{31};
    }else{
        return new int[]{28,30,31};
    }
}
