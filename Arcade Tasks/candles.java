int candles(int candlesNumber, int makeNew) {
  int burned = 0;
  int leftowers = 0;
  while (candlesNumber > 0) {
    burned += candlesNumber;
    leftowers += candlesNumber;
    candlesNumber = leftowers / makeNew;
    leftowers %= makeNew;
  }
  return burned;
}
