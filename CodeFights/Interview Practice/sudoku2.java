boolean sudoku2(char[][] grid) {
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            Set<Character> exists = new HashSet<>();
            for(int k = 0; k < 3; k++){
                int row = i * 3 + k;
                for(int m = 0; m < 3; m++){
                    int col = j * 3 + m;
                    char c = grid[row][col];
                    if(c != '.'){
                        if(exists.contains(c)){
                            return false;
                        }
                        exists.add(c);
                    }
                }
            }
        }
    }
    
    for(int i = 0; i < 9; i++){
        Set<Character> exists1 = new HashSet<>();
        Set<Character> exists2 = new HashSet<>();
        for(int j = 0; j < 9; j++){
            char c = grid[i][j];
            if(c != '.'){
                if(exists1.contains(c)){
                    return false;
                }
                exists1.add(c);
            }
            char c2 = grid[j][i];
            if(c2 != '.'){
                if(exists2.contains(c2)){
                    return false;
                }
                exists2.add(c2);
            }
        }
    }
    
    return true;
}

