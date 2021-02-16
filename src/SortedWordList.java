

public class SortedWordList extends WordList {
	/**
	 * @author Tommaso Coraci
	 *	@since 11/02/20
	 *	@version 1
	 *	@description this class sorts the nodes into the right order
	 *	@function add
	 *	@param Word d
	 *	@return overides 
	 **/
	
	/*
	right click > refactor > rename
	cmd + shift + f: autoformat
	cmd + shift + o: organize imports

	Use <,> when comparing primitives ie: int, float, boolean, char, double
	Use .compareTo() when comparing classes(objects)  ie: String, Scanner

	To use compareTo() set up original boolean expression and then convert:
	current > newNode
	current.data.word.compareTo(newNode.data.word) > 0

	current < newNode
	current.data.word.compareTo(newNode.data.word) < 0

	    newNode
	Node[data,next]
	     prev          newNode              current (larger)  
	Node[data,next] -> Node[data,next] -> Node[data,next] -> null
	*/
	//inherits the dummy node from the WordList class
	
	public SortedWordList() {
		super();
	}
	



	@Override
	public void add(Word d) {
		
		WordNode newNode = new WordNode(d);
		WordNode current = first.next;
		WordNode prev = first; // first is a dummy node

		// Look through the list from left to right
		while (current != null) {
			// Find a node that is larger than newNode.
			if (current.data.word.compareTo(newNode.data.word) > 0) {
				// Insert the new node before the larger node!
				prev.next = newNode;
				newNode.next = current;
				return;
			}

			// Advance current to the next node
			prev = current;
			current = current.next;
		}

		// special case for adding to empty list
		
		if (prev == first) {
			first.next = newNode;
		} else { // never finding a larger node
			prev.next = newNode;
		}
		
	}
	
}
