int matrixElementsSum(int[][] matrix) {
    ArrayList<Integer> col = new ArrayList<Integer>();
    int sum = 0;
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[i][j] == 0 || col.contains(j)){
                col.add(j);
                continue;
            }else{
                sum += matrix[i][j];
            }
        }
    }
    return sum;
}
