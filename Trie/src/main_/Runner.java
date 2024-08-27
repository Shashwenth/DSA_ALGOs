package main_;

import java.util.ArrayList;

import nodeStructure.Node;
import operations.Dictionary;
import operations.Insert;
import operations.Printer;

public class Runner {

	public static void main(String args[]) {
		
		
		System.out.println("Creating Node");
		Node root=new Node(null, false, new ArrayList<Node>());
		
		
		System.out.println("Inserting into Node");
		Insert iTrie=new Insert();
		iTrie.insert(root, "Shash", 0);
		iTrie.insert(root, "Shashwenth", 0);
		iTrie.insert(root, "Muralidharan", 0);
		iTrie.insert(root, "     ", 0); //5 spaces
		iTrie.insert(root, "      !@", 0); //5 spaces
		
		
		System.out.println("Printing Node");
		Printer pTrie=new Printer();
		pTrie.print(root, "");
		
		System.out.println("Find a Word");
		Dictionary dTrie=new Dictionary();
		System.out.println(dTrie.find(root, "Shash", 0)); //True
		System.out.println(dTrie.find(root, "Shashi", 0));  //False
		System.out.println(dTrie.find(root, "Shashwenth", 0)); //True
		System.out.println(dTrie.find(root, "Muralidharan", 0));  //True
		System.out.println(dTrie.find(root, "Shashwenthii", 0));  //False
		System.out.println(dTrie.find(root, "Muralidharan ", 0));  //False
		System.out.println(dTrie.find(root, "     ", 0)); //True
		System.out.println(dTrie.find(root, "     !", 0));  //False
		
		
		
	}
		
}
