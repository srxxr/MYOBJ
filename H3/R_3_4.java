package H3;

public class R_3_4 {
     public static final int X = 1, O = -1; // players
 public static final int EMPTY = 0; // empty cell
 private int board[ ][ ] = new int[3][3]; // game board
 private int player; // current player
 /** Constructor */
         public R_3_4( ) { clearBoard( ); }  /** Clears the board */
                 public void clearBoard( ) {
                     for (int i = 0; i < 3; i++)
             for (int j = 0; j < 3; j++)
             board[i][j] = EMPTY; // every cell should be empty
             player = X; // the first player is 'X'
             }  /** Puts an X or O mark at position i,j. */

             public void putMark(int i, int j) throws IllegalArgumentException {
                 if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
             throw new IllegalArgumentException("Invalid board position");
             if (board[i][j] != EMPTY)
                 throw new IllegalArgumentException("Board position occupied");
                 if (winner() != EMPTY)
                     throw new IllegalStateException("there is winner already!!");

                 board[i][j] = player; // place the mark for the current player
             player = - player; // switch players (uses fact that O = - X)
             }  /** Checks whether the board configuration is a win for the given player. */

                 public boolean isWin(int mark) {
                     return ((board[0][0] + board[0][1] + board[0][2] == mark*3) // row 0
             || (board[1][0] + board[1][1] + board[1][2] == mark*3) // row 1
             || (board[2][0] + board[2][1] + board[2][2] == mark*3) // row 2
             || (board[0][0] + board[1][0] + board[2][0] == mark*3) // column 0
             || (board[0][1] + board[1][1] + board[2][1] == mark*3) // column 1
             || (board[0][2] + board[1][2] + board[2][2] == mark*3) // column 2
             || (board[0][0] + board[1][1] + board[2][2] == mark*3) // diagonal
             || (board[2][0] + board[1][1] + board[0][2] == mark*3)); // rev diag
             }  /** Returns the winning player's code, or 0 to indicate a tie (or unfinished game).*/
                 public int winner( ) {
                     if (isWin(X))
             return(X);
             else if (isWin(O))
                 return(O);
             else
             return(0);
             }
}
