int phoneCall(int min1, int min2_10, int min11, int s) {
    int minutes = 0;
    if (s >= min1) {
        minutes++;
        s = s - min1;
    } else{
        return minutes;
    }
    while (s >= min2_10 && minutes < 10) {
        if (s >= min2_10) {
            minutes++;
            s = s - min2_10;
        } else return minutes;
    }
    if (minutes < 10) {
        return minutes;
    }
    minutes += s / min11;
    return minutes;
}
