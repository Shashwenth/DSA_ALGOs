package operations;

import java.util.List;

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
		//boolean ans=false;
		for(Node node:root.children) {
			if(node.value==str.charAt(i)) {
				//ans = ans || find(node, str, i+1);
				return find(node, str, i+1);
			}
		}
		//return ans;
		return false;
		
	}
	
	public void find_prefix(Node root, String prefix, List<String> list, int i){
		if(i==prefix.length()) {
			fillPrefix(root, list, prefix);
			return;
		}
		if(root==null) {
			return;
		}
		
		for(Node node: root.children) {
			if(node.value==prefix.charAt(i)) {
				find_prefix(node, prefix, list, i+1);
			}
		}
		
	}

	private void fillPrefix(Node root, List<String> list, String curr) {
		
		if(root==null) {
			return;
		}
		if(root.isEnd) {
			list.add(curr);
		}
		for(Node node:root.children) {
			fillPrefix(node, list, curr+String.valueOf(node.value));
		}
		
	}
	
	

	
	
	
}
