//https://leetcode.com/problems/available-captures-for-rook/?envType=problem-list-v2&envId=array
/*

999. Available Captures for Rook

You are given an 8 x 8 matrix representing a chessboard. There is exactly one white rook represented by 'R', some number of white bishops 'B', and some number of black pawns 'p'. Empty squares are represented by '.'.

A rook can move any number of squares horizontally or vertically (up, down, left, right) until it reaches another piece or the edge of the board. A rook is attacking a pawn if it can move to the pawn's square in one move.

Note: A rook cannot move through other pieces, such as bishops or pawns. This means a rook cannot attack a pawn if there is another piece blocking the path.

Return the number of pawns the white rook is attacking.
 */

import java.util.Scanner;

public class AvaliableCapturesForRook {
    public static int numRookCaptures(int[][] board){
        int x=0,y=0,res=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        int[][] dirs = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] dir:dirs){
            for(int a=x+dir[0],b=y+dir[1];a>=0 && a<8 &&b >=0 && b<8 ;a+=dir[0],b+=dir[1]){
                if(board[a][b]=='p'){
                    res++;
                    break;
                }
                else if(board[a][b]=='.'){
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println(numRookCaptures(board));
    }
}
