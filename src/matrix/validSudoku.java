package matrix;

import java.util.HashSet;
import java.util.Set;

public class validSudoku {
    public static void main(String[] args) {
        validSudoku validSudoku = new validSudoku();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(validSudoku.isValidSudoku(board));
    }
    //git
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int row=0;row<9;row++){
//            Set<Integer> rows = new HashSet<>();
//            Set<Integer> cols = new HashSet<>();
//            Set<Integer> squares = new HashSet<>(); // key, value = (r/3,c/3)
            for(int col = 0; col <9; col++){
                char current_val = board[row][col];
                if(current_val!= '.'){
                    if((!seen.add(current_val+" in row "+row)) ||
                            (!seen.add(current_val+" in col "+col)) ||
                            (!seen.add(current_val+" in box "+row/3+"-"+col/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
