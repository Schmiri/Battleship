
public interface Ships {

	
	/*	waagerecht oder senkrecht plaziert
	 * 	nicht überschneiden
	 *  nicht aneinander stoßen
	 *  
	 *  zerstörer: 
	 *  	große kanonen
	 *  	3 felder nebeneinander
	 * 		3 runden nachladen
	 * 		- 5 felder groß
	 * 	fregatte:
	 * 		2 felder nebeneinander
	 * 		2 runden nachladen
	 * 		- 4 felder groß
	 *  korvette:
	 *  	1 feld 
	 *  	1 runde nachladen
	 *  	- 3 felder groß
	 *  uboot:
	 *  	1 feld 
	 *  	1 runde nachladen
	 * 		- 2 felder groß	 * 
	 * 
	 * */
	
	public  void groesse();
	public  void schussanzahl();
	public  void nachladen();
}
