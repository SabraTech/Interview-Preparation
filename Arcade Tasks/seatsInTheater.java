int seatsInTheater(int nCols, int nRows, int col, int row) {
    int ans = (nCols - (col-1)) * (nRows - row);
    return ans;
}
