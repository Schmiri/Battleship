import java.util.Scanner;

public class Spielfeld {
	
	private int[][] feld;
	
	public Spielfeld() {
		this.feld = new int[][];
	}

    public static void initBoard(int[][] board, int anz){
    	
        for(int row=0 ; row < anz ; row++ )
            for(int column=0 ; column < anz ; column++ )
                board[row][column]=-1;
    }
    /*
    public static void showBoard(int[][] board){
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();
        
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
            System.out.println();
        }

    }

	*/

}
