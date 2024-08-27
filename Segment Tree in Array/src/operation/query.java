package operation;

public class query {
	
	
	public query() {
		super();
	}

	public int compute(int[] array, int start, int end, int l, int r, int curr) {
		
		if(l>end || r<start) {
			return 0;
		}
		if(l<=start && end<=r) {
			return array[curr];
		}
		int mid=(start+end)/2;
		int left_sum=compute(array, start, mid, l, r, curr*2+1);
		int right_sum=compute(array, mid+1, end, l, r, curr*2+2);
		return left_sum+right_sum;
		
	}
	
}
