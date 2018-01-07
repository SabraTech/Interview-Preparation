boolean chessBoardCellColor(String cell1, String cell2) {
    int x1 = cell1.charAt(0) - 'A', x2 = cell1.charAt(1) - '1';
    int y1 = cell2.charAt(0) - 'A', y2 = cell2.charAt(1) - '1';
    return (x1 + y1) % 2 == (x2 + y2) % 2;
}
