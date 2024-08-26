package Operations;

import java.util.Arrays;

import node_Structure.Node;

public class BuildTree {
	
	
	public int[] array;
	
	public BuildTree() {
		super();
		System.out.println("Creating a Build Tree Obect");
		
	}
	
	public void setArray(int[] arr) {
		array=Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	public Node build(Node root, int start, int end) {
		if(start==end) {
			Node node=new Node(start,end,null,null,array[start]);
			return node;
		}
		
		else {
			int mid=(start+end)/2;
			Node node=new Node(start,end,null,null,null);
			Node left=build(node, start, mid);
			Node right=build(node, mid+1, end);
			node.left=left;
			node.right=right;
			node.value=left.value+right.value;
			return node;
			
		}
		
	}
	
	public void printTreeLeaf(Node root) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			System.out.printf("%d %d %d\n",root.start,root.end,root.value);
		}
		printTreeLeaf(root.left);
		printTreeLeaf(root.right);
	}
	
	public void printTreePreorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.printf("%d %d %d\n",root.start,root.end, root.value);
		printTreePreorder(root.left);
		printTreePreorder(root.right);
	}

}
