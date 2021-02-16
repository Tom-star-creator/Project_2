import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;


public class WordGUI extends JFrame{

	/**
	 * @author Tommaso Coraci
	 *	@since 11/02/20
	 *	@version 1
	 *	@description uses a GUI to display the unsorted and sorted nodes into a 1x2 gridlayout
	 *	@function add
	 *	@param String sorted, String unSorted
	 *	@return this function returns the textareas of the sorted and unsorted strings
	 *
	 *
	 **/
	
	private TextArea UnSortedWordList; // need a textarea to display the strings from the Nodelist
	private TextArea SortedWordList; // need a textarea to display the sorted strings from the Nodelist 

	
	public WordGUI() {
        
		 UnSortedWordList = new TextArea();
		 SortedWordList = new TextArea();
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocation(200,200);
        this.setLayout(new GridLayout(1,2)); //Makes JFrame a GridLayout
        
        JScrollPane scrollPane1 = new JScrollPane(UnSortedWordList);
        JScrollPane scrollPane2 = new JScrollPane(SortedWordList);
        
        scrollPane1.setViewportView(SortedWordList); //component any JavaSwing component a.k.a. textarea
        scrollPane2.setViewportView(UnSortedWordList);
        
        this.getContentPane().add(scrollPane1); // uses a scrollPane to move the textarea
        this.getContentPane().add(scrollPane2);
        
        this.add(scrollPane1);
        this.add(scrollPane2);
        this.setVisible(true);
        
        
        
    } 
		public void add(String sorted, String unSorted) {
			this.UnSortedWordList.append(unSorted);
			this.SortedWordList.append(sorted);
		}
	
	
		
	}
	

