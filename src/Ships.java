
public interface Ships {

	
	/*	waagerecht oder senkrecht plaziert
	 * 	nicht ueberschneiden
	 *  nicht aneinander stossen
	 *  
	 *  zerstoerer: 
	 *  	grosse kanonen
	 *  	3 felder nebeneinander
	 * 		3 runden nachladen
	 * 		- 5 felder gross
	 * 	fregatte:
	 * 		2 felder nebeneinander
	 * 		2 runden nachladen
	 * 		- 4 felder gross
	 * */
	
	public void groesse();
	public void schussanzahl();
	public void nachladen();
}

