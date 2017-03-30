boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    int yourTotal = yourLeft + yourRight;
    int friendsTotal = friendsLeft + friendsRight;
    int yourDiff = Math.abs(yourLeft - yourRight);
    int friendsDiff = Math.abs(friendsLeft - friendsRight);
    if(yourTotal == friendsTotal && yourDiff == friendsDiff){
        return true;
    }
    return false;

}
