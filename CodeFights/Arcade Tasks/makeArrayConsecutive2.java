int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
    int n = statues.length;
    int max = statues[n-1];
    int min = statues[0];
    return max - min - n + 1;
}
