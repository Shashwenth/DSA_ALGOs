package operations;

import java.util.ArrayList;

import nodeStructure.Node;

public class Insert {
	
	
	
	public Insert() {
		super();
	}

	public void insert(Node root, String str, int i) {
		if(i>=str.length()) {
			root.isEnd=true;
			return;
		}
		int flag=0;
		for(Node node:root.children) {
			if(node.value==str.charAt(i)) {
				flag=1;
				insert(node, str, i+1);
			}
		}
		if(flag==0) {
			Node new_Node=new Node(str.charAt(i), false, new ArrayList<Node>());
			root.children.add(new_Node);
			insert(new_Node, str, i+1);	
		}
	}
	
}
