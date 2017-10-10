String findProfession(int level, int pos) {
    String eng = "Engineer";
    String doc = "Doctor";
    if(level == 1){
        return eng;
    }
    if(findProfession(level - 1, (pos + 1) / 2).equals(doc)){
        if(pos % 2 != 0){
            return doc;
        } else {
            return eng;
        }
    }
    if(pos % 2 != 0){
        return eng;
    } else {
        return doc;
    }

}

