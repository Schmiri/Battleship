import java.util.Scanner;


public class Player {
	/*
	 * 1. Auswahl eines verfuegbaren Schiffes
	 * 2. Auswahl eines Gegners.
	 * 3. Koordinate auf dem Spielfeld auswählen
	 * 4. Info ob getroffen wurde
	 * 
	 */
	public void hasShips(){		
		 Ships s1 = new Ships();
	           
	}
	public void putShips(){
		//hier wird abgefragt, wo der spieler die schiffe hin tut
		
	}
	public void hasBoard(){
		//Spielfeld fesgeben
		
	}
	
    public void shoot(int[] shoot){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Row: ");
        shoot[0] = input.nextInt();
        shoot[0]--;
        
        System.out.print("Column: ");
        shoot[1] = input.nextInt();
        shoot[1]--;
        
    }
}
