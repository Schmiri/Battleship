
public interface Ships {

	
	/*	waagerecht oder senkrecht plaziert
	 * 	nicht �berschneiden
	 *  nicht aneinander sto�en
	 *  
	 *  zerst�rer: 
	 *  	gro�e kanonen
	 *  	3 felder nebeneinander
	 * 		3 runden nachladen
	 * 		- 5 felder gro�
	 * 	fregatte:
	 * 		2 felder nebeneinander
	 * 		2 runden nachladen
	 * 		- 4 felder gro�
	 *  korvette:
	 *  	1 feld 
	 *  	1 runde nachladen
	 *  	- 3 felder gro�
	 *  uboot:
	 *  	1 feld 
	 *  	1 runde nachladen
	 * 		- 2 felder gro�	 * 
	 * 
	 * */
	
	public  void groesse();
	public  void schussanzahl();
	public  void nachladen();
}
