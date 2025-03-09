import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize the board with empty spaces
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X'; // Start with player 'X'
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + ", enter row and column (0-2): ");
            
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Validate input
            if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
                System.out.println("Invalid Move\nTry Again");
                continue;
            }

            // Place the player's mark
            board[row][col] = player;

            // Check if the player has won
            gameOver = haveWon(board, player);
            if (gameOver) {
                printBoard(board);
                System.out.println("The player " + player + " has won!");
                break;
            }

            // Switch player
            player = (player == 'X') ? 'O' : 'X';
        }

        sc.close();
    }

    public static boolean haveWon(char[][] board, char player) {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (col < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("---------");
            }
        }
    }
}
