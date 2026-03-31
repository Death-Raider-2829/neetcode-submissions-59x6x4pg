class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check if same number exists in the same row
        for(int i=0;i<board.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<board.length;j++){
                // If the current character is digit then add to set
                if(Character.isDigit(board[i][j])){
                    int n=(int)(board[i][j]-'0');
                    if(set.contains(n)){
                        return false;
                    }
                    else{
                        set.add(n);
                    }
                }
            }
        }

        // Check if the same number exists in the same column
        for(int i=0;i<board.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<board.length;j++){
                // If character exists in set then we return false
                if(Character.isDigit(board[j][i])){
                    int n=(int)(board[j][i]-'0');
                    if(set.contains(n)){
                        return false;
                    }
                    else{
                        set.add(n);
                    }
                }
            }
        }

        // As there are 9 matrices present we need to loop around 9 times
        int i=0;
        while(i<9){
            // Start index is always in muliples of 3 be it row or column
            int start_row=(i/3)*3;
            int start_column=(i%3)*3;

            int end_row=start_row+3;
            int end_column=start_column+3;

            // Now take each matrix and see if there is a repeated number in a 3*3 matrix
            HashSet<Integer> set=new HashSet<>();

            for(int j=start_row;j<end_row;j++){
                for(int k=start_column;k<end_column;k++){
                    if(Character.isDigit(board[j][k])){
                        int n=(int)(board[j][k]-'0');
                        if(set.contains(n)){
                            return false;
                        }
                        else{
                            set.add(n);
                        }
                    }    
                }
            }
            i++;
        }

        return true;
    }
}
