public abstract class WordList {
	
	/**
	 * @author Tommaso Coraci
	 *	@since 11/02/20
	 *	@version 1
	 *	@description allows for the Linkedlist to work from the Node class
	 *	@function add
	 *	@param Word d
	 *	@return this uses a Word type that allows the string to hold the data and that's used because the Word class uses a String 
	 *	@function toString
	 *	@return  allows for the data to of the string to be returned in each line through the String returnString 
	 *
	 **/

	protected WordNode first = new WordNode(null); // enables a dummy node 
	protected WordNode last = first;
	protected int length = 0; // determines the lenght of the nodelist

	
	public abstract void add(Word d);

	public String toString() {
		WordNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + "\n";
			p = p.next;
		}
		return returnString;
	}

}
