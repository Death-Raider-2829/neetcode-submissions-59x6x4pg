class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> row=new HashSet<>();
            for(int j=0;j<board.length;j++){
               if(Character.isDigit(board[i][j])){
                if(row.contains(board[i][j])==true){
                    return false;
                }
                else{
                    row.add(board[i][j]);
                }
               }
            }
        }

        for(int i=0;i<board.length;i++){
            HashSet<Character> column=new HashSet<>();
            for(int j=0;j<board.length;j++){
               if(Character.isDigit(board[j][i])){
                if(column.contains(board[j][i])==true){
                    return false;
                }
                else{
                    column.add(board[j][i]);
                }
               }
            }
        }


        // (00,03) (20,22) //05 55 //06 88 
        int total_units=9;
        int i=0;
        while(i<total_units){
            int start_row=(i/3)*3;
            int start_column=(i%3)*3;

            int end_row=start_row+3;
            int end_column=start_column+3;
            HashSet<Character> set=new HashSet<>();
            for(int x=start_row;x<end_row;x++){

                for(int j=start_column;j<end_column;j++){
                    if(Character.isDigit(board[x][j])){
                        if(set.contains(board[x][j])==true){
                            return false;
                        }
                        set.add(board[x][j]);
                    } 
                }
            }
            i++;
        }
        return true;
    }
}
