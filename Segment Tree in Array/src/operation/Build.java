package operation;

import java.util.Arrays;

public class Build {

	public Build() {
		super();
	}
	
	public void build(int[] array, int start, int end, int curr, int[] original_array) {
		
		if(start==end) {
			array[curr]=original_array[start];
		}
		
		else {
			int mid=(start+end)/2;
			build(array, start, mid, curr*2+1, original_array);
			build(array, mid+1, end, curr*2+2, original_array);
			array[curr]=array[curr*2+1]+array[curr*2+2];
		}
		
		
	}
	
	public void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
}
