int adjacentElementsProduct(int[] inputArray) {
    int prod = Integer.MIN_VALUE;
    for(int i = 0, j = 1; i < inputArray.length - 1; i++, j++){
        int prod2 = inputArray[i] * inputArray[j];
        if(prod < prod2){
            prod = prod2;
        }
    }
    return prod;
}
