package operations;

import nodeStructure.Node;

public class Dictionary {

	public Dictionary() {
		super();
	}
	
	public boolean find(Node root, String str, int i){
		
		if(root==null) {
			return false;
		}
		if(i==str.length()) {
			if(root.isEnd) {
				return true;
			}
			return false;
		}
		for(Node node:root.children) {
			if(node.value==str.charAt(i)) {
				return find(node, str, i+1);
			}
		}
		return false;
		
	}

	
	
	
}
