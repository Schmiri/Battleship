import java.util.Scanner;


public class Player {
	/*
	 * 1. Auswahl eines verfuegbaren Schiffes
	 * 2. Auswahl eines Gegners.
	 * 3. Koordinate auf dem Spielfeld auswÃ¤hlen
	 * 4. Info ob getroffen wurde
	 * 
	 */
	public void hasShips(){		
		 Ships s1 = new Uboot();
		 Ships s2 = new Korvette();
		 Ships s3 = new Zerstoerer();
		 Ships s4 = new Fregatte();
	}
	public void putShips(){
		//hier wird abgefragt, wo der spieler die schiffe hin tut
		
		
	}
	public void hasBoard(){
		//Spielfeld festlegen
		//größe kommt von spiel bzw eingabe
		/*
		 * es gibt ein eigenes mit dne plazierten Schiffen
		 * und es gibt eins, dass die gegner sehen -> wo hingeschossen wurde und wo getroffen wurde
		 * 
		 * */
		
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
    public static boolean hit(int[] shoot, int[][] ships){
        
        for(int ship=0 ; ship<ships.length ; ship++){
            if( shoot[0]==ships[ship][0] && shoot[1]==ships[ship][1]){
                System.out.printf("You hit a ship located in (%d,%d)\n",shoot[0]+1,shoot[1]+1);
                return true;
            }
        }
        return false;
    }
}
