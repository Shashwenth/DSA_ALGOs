package nodeStructure;

import java.util.List;

public class Node {
	
	public Character value;
	public boolean isEnd;
	public List<Node> children;
	
	public Node() {
		super();
	}

	public Node(Character value, boolean isEnd, List<Node> children) {
		super();
		this.value = value;
		this.isEnd = isEnd;
		this.children = children;
	}
	
	
}
