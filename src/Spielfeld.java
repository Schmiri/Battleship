package battleship;

import java.util.Scanner;

public class Spielfeld {
    
    private int[][] feld;
    
    public Spielfeld() {
        //this.feld = new int[][];
    }

    public static void initBoard(int[][] board, int anz){
        
        for(int row=0 ; row < anz ; row++ )
            for(int column=0 ; column < anz ; column++ )
                board[row][column]=-1;
    }
    
    public static void showBoard(int[][] board, int anz){

       for (int i = 0; i < anz; i++){
           char upper = (char) ('A' + i);        
                  System.out.print("\t"+upper);
       }

       
        System.out.println();
        
        for(int row=0 ; row < anz ; row++ ){
            System.out.print((row+1)+"");
            for(int column=0 ; column < anz ; column++ ){
                if(board[row][column]==-1){
                    System.out.print("\t"+"~");
                }else if(board[row][column]==0){
                    System.out.print("\t"+"*");
                }else if(board[row][column]==1){
                    System.out.print("\t"+"X");
                }
                
            }
            System.out.println();
        }

    }

    

}
