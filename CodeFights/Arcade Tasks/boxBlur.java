int[][] boxBlur(int[][] image) {
    int[][] answer = new int[image.length - 2][image[0].length - 2];
    for (int x = 1; x < image.length - 1; x++) {
        for (int y = 1; y < image[0].length - 1; y++) {
            int sum = 0;
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    sum += image[x + dx][y + dy];
                }
            }
            answer[x - 1][y - 1] = sum / 9;
        }
    }
    return answer;
}
