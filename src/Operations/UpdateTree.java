package Operations;

import node_Structure.Node;

public class UpdateTree {

	public UpdateTree() {
		super();
	}
	
	public void updateArr(int[] arr, int idx, int val) {
		arr[idx]=val;
	}

	public void update(Node root, int start, int end, int idx, int val) {
		if(start==end) {
			root.value=val;
		}
		else {
			int mid=(start+end)/2;
			if(idx>=start && idx<=mid) {
				update(root.left, start, mid, idx, val);
			}
			else {
				update(root.right, mid+1, end, idx, val);
			}
			root.value=root.left.value+root.right.value;
		}
		
	}
		
}
