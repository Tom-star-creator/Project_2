public class Word {

	/**
	 * @author Tommaso Coraci
	 *	@since 11/02/20
	 *	@version 1
	 *	@description this allows for the strings to be returned & takes in the String 
	 *	@function toString 
	 *	@return allows the String to be returned from the toString method inside the WordList class
	 *
	 * 
	 **/
	
	//New Word Being Inserted 
	protected String word;
	
	//returns the Word
	public Word(String word) {
		this.word = word;
	}

	// enables the String to be printed
	public String toString() {
		return this.word;
	}

}
