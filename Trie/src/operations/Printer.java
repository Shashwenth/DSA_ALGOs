package operations;

import nodeStructure.Node;

public class Printer {
	
	
	
	public Printer() {
		super();
	}

	public void print(Node root, String curr) {
		
		if(root==null) {
			System.out.println("Root is NULL");
			return;
		}
		
//		System.out.println("Inside Debug");
//		System.out.println("Root value is -- " + String.valueOf(root.value));
//		System.out.println("Childrens of Root");
//		for(Node n:root.children) {
//			System.out.print(n.value);
//			System.out.print(" ");
//		}
//		System.out.println();
//		System.out.println("Curr Inside Print + "+curr);
//		curr+=String.valueOf(root.value);
		if(root.isEnd) {
//			System.out.println("Printing curr");
			System.out.println(curr);
		}
		for(Node n:root.children) {
			curr+=String.valueOf(n.value);
			print(n, curr);
			curr=curr.substring(0, curr.length()-1);
		}
		
	}
	
}
