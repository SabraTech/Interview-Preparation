int[][] rotateImage(int[][] a) {
    int n = a.length;
    for(int layer = 0; layer < n/2; layer++){
        int first = layer;
        int last = n - 1 - layer;
        for(int i = first; i < last; i++){
            int offset = i - first;
            int top = a[first][i];
            a[first][i] = a[last-offset][first];
            a[last - offset][first] = a[last][last - offset];
            a[last][last - offset] = a[i][last];
            a[i][last] = top;
        }
    }
    return a;
}
