package runner;

import java.util.Arrays;

import Operations.BuildTree;
import Operations.QueryTree;
import Operations.UpdateTree;
import node_Structure.Node;

public class Main {
	
	public static void main(String args[]) {
		Runtime runtime = Runtime.getRuntime();
		long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used Memory in bytes: " + memoryBefore);
		BuildTree bt=new BuildTree();
		int[] arr=new int[] {0,1,2,3,4,5,6};
		bt.setArray(arr);
		Node root=bt.build(null, 0, arr.length-1);
		System.out.println("Printing Leaf Nodes");
		bt.printTreeLeaf(root);
		System.out.println("Printing PreOrder Traversal");
		bt.printTreePreorder(root);
		
		
		QueryTree qt=new QueryTree();
		int ans=qt.query(root, 0, 6, 0, 5);
		System.out.println("Sum of the resulting range [0:5] inclusive = "+String.valueOf(ans));
		
		
		UpdateTree ut=new UpdateTree();
		// Updata idx 5 -> 10;
		System.out.println("Update idx 5 value from 5 to 10");
		ut.updateArr(arr, 5, 10);
		System.out.println("Updated Array : " + Arrays.toString(arr));
		ut.update(root, 0, 6, 5, 10);
		ans=qt.query(root, 0, 6, 0, 5);
		System.out.println("Sum of the updated resulting range [0:5] inclusive = "+String.valueOf(ans));
		long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used Memory in bytes after execution: " + memoryAfter);

        // Memory used by your code
        long memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memory used by your code in bytes: " + memoryUsed);
		
	}
	
}

