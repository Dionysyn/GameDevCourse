import java.util.Random;
import java.util.Scanner;

public class battleShip {

    // main method = our programs to do list
    public static void main(String[] args) 
    {
     int[][] board = new int[5][5];
        int[][] ships = new int[3][2];
        int[] shoot = new int[2];
        int attempts=0,
            shotHit=0;
        
        initBoard(board);
        initShips(ships);
        
        System.out.println();
        // we need a board
        // we need a shot (x, y)
        // we need a ship (2 places)
        // we need to keep track of number of attempts/ hits

        // create board
        // create ship postions

        // until all ships have been hit ( 3 ships):
            // display the board
            // ask for input
            // keep track of attempts
    }
    
    // create our games board: 
    public static void initBoard(int[][] board)
    {
        for(int row=0 ; row < 5 ; row++ )
            for(int column=0 ; column < 5 ; column++ )
                board[row][column]=-1;

        // initialize all spots of the 2d array as -1
    }
    
    // display changes in board after each hit:
    public static void showBoard(int[][] board)
    {
        
        
        for(int row=0 ; row < 5 ; row++ ){
            System.out.print((row+1)+"");
            for(int column=0 ; column < 5 ; column++ ){
                if(board[row][column]==-1){
                    System.out.print("\t"+"~");
                }else if(board[row][column]==0){
                    System.out.print("\t"+"*");
                }else if(board[row][column]==1){
                    System.out.print("\t"+"X");
                }
                
            }
        // create a 2d loop 
            // if it is a -1 then it does not have a ship = -1
            // if it is a 0 then it is a *,  no ship there (shot missed)
            // if it is a X then it is an X, shot hit/ ship sunk

    }

    // create ship positions:
    public static void initShips(int[][] ships)
    {
       
    }

    // get input
    public static void shoot(int[] shoot)
    {
      /*
      takes two integers.
    The user will enter numbers from 1 to 5, because it counts from 1 to 5.
    You, as a Java programmer, that counts from 0 to 4.
    Therefore, after the user enters the row and column, SUBTRACT 1 of each of these value.
      */
        
    }
    //calculate input
    public static boolean hit(int[] shoot, int[][] ships)
    {
        
        
    }

    //provide feedback to user
    public static void hint(int[] shoot, int[][] ships, int attempt)
    {

    }

    //update board for user
    public static void changeboard(int[] shoot, int[][] ships, int[][] board)
    {

    }

}