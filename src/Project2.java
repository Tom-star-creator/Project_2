import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Project2 {
	
	/**
	 * @author Tommaso Coraci
	 *	@since 11/02/20
	 *	@version 1
	 *	@description checks the all words in the text file and sorts them or unsorts them
	 *
	 **/

	public static void main(String[] args) {

	
		
		UnsortedWordList uwl = new UnsortedWordList(); // creates a unsorted object
		SortedWordList swl = new SortedWordList(); // creates a sorted object
		BufferedReader x;

		
		 //allows for the StringTokenizer to go each through string inside the file 
		
		try {
			
			File myFile = new File("Words.txt");
			x = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));
			String line = x.readLine();

			while (line != null) {
				StringTokenizer tokens = new StringTokenizer(line);
				while (tokens.hasMoreTokens()) {
					String word = tokens.nextToken();
					uwl.add(new Word(word));
					swl.add(new Word(word));
				}
				// tokens = new StringTokenizer(line);
				line = x.readLine();

			}
			x.close();
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}

		
		WordGUI gui = new WordGUI();
		gui.add(uwl.toString(), swl.toString());
		//System.out.println(uwl);
		//System.out.println(swl);
	}

}
