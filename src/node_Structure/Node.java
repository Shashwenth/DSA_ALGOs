package node_Structure;

public class Node {
	public int start;
	public int end;
	public Node left;
	public Node right;
	public Integer value;
	
	public Node() {
		super();
	}
	
	public Node(int start, int end, Node left, Node right, Integer value) {
		super();
		this.start = start;
		this.end = end;
		this.left = left;
		this.right = right;
		this.value= value;
	}
	
	
}
