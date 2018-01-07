int avoidObstacles(int[] inputArray) {
    boolean found = false;
    int i = 1;
    while(true){
        found = true;
        for(int j = 0; j < inputArray.length; j++){
            if(inputArray[j] % i == 0){
                found = false;
            }
        }
        if(found){
            return i;
        }
        i++;
    }
}
