package Operations;

import node_Structure.Node;

public class QueryTree {

	public QueryTree() {
		super();
	}
	
		
	public int query(Node root, int start, int end, int x, int y) {
		
		if(y<start || x>end) {
			return 0;
		}
		
		if(x<=start && end<=y) {
			return root.value;
		}
		
		int mid=(start+end)/2;
		
		int left_sum=query(root.left, start, mid, x, y);
		int right_sum=query(root.right, mid+1, end, x, y);
		return left_sum+right_sum;
		
	}
	
}
