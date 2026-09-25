class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            Set<Character> rowset = new HashSet<>();

            for(int j=0;j<9;j++){
                char ch = board[i][j];

                if(rowset.contains(ch)){
                    return false;
                }
                else{
                    if(ch != '.'){
                        rowset.add(ch);
                    }
                }
            }
        }

        for(int i=0;i<9;i++){
            Set<Character> colset = new HashSet<>();

            for(int j=0;j<9;j++){
                char ch = board[j][i];

                if(colset.contains(ch)){
                    return false;
                }
                else{
                    if(ch != '.'){
                        colset.add(ch);
                    }
                }
            }
        }

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){

                Set<Character> boxset = new HashSet<>();

                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){

                        char ch = board[k][l];

                        if(boxset.contains(ch)){
                            return false;
                        }
                        else{
                            if(ch != '.'){
                                boxset.add(ch);
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
