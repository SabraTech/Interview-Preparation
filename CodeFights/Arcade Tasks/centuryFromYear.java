int centuryFromYear(int year) {
    if(year % 100 == 0){
        return year / 100;
    }
    return (year / 100) + 1;
}
