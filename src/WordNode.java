
public class WordNode {
	/**
	 * @author Tommaso Coraci
	 *	@since 11/02/20
	 *	@version 1
	 *	@description this is used in order to go through each node which contains the data
	 *	
	 **/
	
	protected Word data; // uses the string from the word class to hold the data
	protected WordNode next; 


	public WordNode(Word word) {
		data = word;
		next = null;
	}
}
