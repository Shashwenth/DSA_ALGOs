package operation;

public class Update {
	
	
	public void setOriginalArray(int[] arr, int idx, int val) {
		arr[idx]=val;
	}
	
		
	public void update(int[] array, int start, int end, int idx, int curr, int value) {
		
		if(start==end) {
			array[curr]=value;
		}
		
		else {
			int mid=(start+end)/2;
			if(idx>=start && idx<=mid) {
				update(array, start, mid, idx, curr*2+1, value);
			}
			else {
				update(array, mid+1, end, idx, curr*2+2, value);
			}
			array[curr]=array[curr*2+1]+array[curr*2+2];
		}
		
		
		
	}
	
}
