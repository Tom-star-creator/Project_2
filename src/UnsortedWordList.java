
public class UnsortedWordList extends WordList {
	
	/**
	 * @author Tommaso Coraci
	 *	@since 11/02/20
	 *	@version 1
	 *	@description just display the words from the textfile into the order it was originally in 
	 **/
	
	// inherits the dummy node from the WordList class
	
	public UnsortedWordList() {
		super();
		
	}
	
 // used the append function as a way to just list the strings in the textfile in the original order
	@Override
	public void add(Word d) {
		WordNode newNode = new WordNode(d);
		last.next=newNode; 
		last=newNode; 
		length++;
		
	}
	
	
	
	
}

