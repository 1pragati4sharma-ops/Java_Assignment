package Java_Assignment4.Module9;
    // LeetCode 51 – N Queens
import java.util.*;

    public class NQueens {

        static boolean isSafe(char[][] board,int row,int col){
            for(int i=0;i<row;i++)
                if(board[i][col]=='Q') return false;

            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
                if(board[i][j]=='Q') return false;

            for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
                if(board[i][j]=='Q') return false;

            return true;
        }

        static void solve(int row,char[][] board){
            if(row==board.length){
                for(char[] r:board)
                    System.out.println(Arrays.toString(r));
                System.out.println();
                return;
            }

            for(int col=0;col<board.length;col++){
                if(isSafe(board,row,col)){
                    board[row][col]='Q';
                    solve(row+1,board);
                    board[row][col]='.';
                }
            }
        }

        public static void main(String[] args){
            int n=4;
            char[][] board=new char[n][n];
            for(char[] r:board) Arrays.fill(r,'.');

            solve(0,board);
        }
    }


