package algorithm.arrays;
import java.util.*;

/**
   Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

   Each row must contain the digits 1-9 without repetition.
   Each column must contain the digits 1-9 without repetition.
   Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // check rows
        boolean validRows = false;
        for(int row = 0; row < 9; row++) {
            if(!validRow(row, board)) {
                validRows = false;
                break;
            }
            validRows = true;
        }
        // check columns
        boolean validColumns = false;
        for(int column = 0; column < 9; column++) {
            if(!validColumn(column, board)) {
                validColumns = false;
                break;
            }
            validColumns = true;
        }
        // check boxes
        boolean validGrids = false;
        for(int i = 0; i < 9; i++) {
            if(!validGrids(board, i)){
                validGrids = false;
                break;
            }
            validGrids = true;
        }

        return validRows && validColumns && validGrids;
    }

    private boolean validRow(int row, char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int column = 0; column < board[row].length; column++) {
            char num = board[row][column];
            if (num != '.' && !set.add(num)) {
                return false;
            }
        }
        return true;
    }

    private boolean validColumn(int column, char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int row = 0; row < 9; row++) {
            char num = board[row][column];
            if (num != '.' && !set.add(num)) {
                return false;
            }
        }
        return true;
    }

    private boolean validGrids(char[][] board, int grid) {
        HashSet<Character> set = new HashSet<>();
        int rowOffset = (grid / 3) * 3;
        int colOffset = (grid % 3) * 3;
        for (int row = rowOffset; row < rowOffset + 3; row++) {
            for (int col = colOffset; col < colOffset + 3; col++) {
                char num = board[row][col];
                if (num != '.' && !set.add(num)) {
                    return false;
                }
            }
        }
        return true; 
    }
}
