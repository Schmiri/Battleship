/* Klasse beinhaltet die main-Methode
 * in der Klasse wird die Feldgroesse, Schiff- und Spieleranzahl eingestellt 
 * 
 * 
 */

public class Spiel {
	
	
	/*Methode, die mit Hilfe einer Matrix die Feldgroesse bestimmt*/
	public int[][] feldGroesse(){	
		

	}
	
	/*Methode mit der man die Anzahl der Schiffe bestimmen kann*/
	public int schiffAnzahl(){
		
	}
	
	/*Methode mit der man die Anzahl der Schiffe bestimmen kann*/
	public int spielerAnzahl(){
		
		
	}
	
	
    public static void main(String[] args) {
        
    	//spielfeld erstellen
        System.out.println("Gr��e des Spielfelds eingeben  ");
        int anz = System.in.readInt();
        int[][] board = new int[anz][anz];
        Spielfeld sf = new Spielfeld();
        sf.initBoard(board, anz);
        
    	/*
        
        int[][] ships = new int[3][2];
        int[] shoot = new int[2];
        int attempts=0,
            shotHit=0;
        
        initBoard(board);
        initShips(ships);
        
        System.out.println();
        
        do{
            showBoard(board);
            shoot(shoot);
            attempts++;
            
            if(hit(shoot,ships)){
                hint(shoot,ships,attempts);
                shotHit++;
            }                
            else
                hint(shoot,ships,attempts);
            
            changeboard(shoot,ships,board);
            

        }while(shotHit!=3);
        
        System.out.println("\n\n\nBattleship Java game finished! You hit 3 ships in "+attempts+" attempts");
        showBoard(board);
        */
    }
	
	
	
		
	
}
