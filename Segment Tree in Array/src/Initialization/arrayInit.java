package Initialization;

import java.util.Arrays;

public class arrayInit {
		
	public int[] array;
	public int length;
	
	
	public arrayInit() {
		super();
	}


	public arrayInit(int[] array, int length) {
		super();
		this.length = length;
		int m = (int) Math.pow(2, Math.ceil(Math.log(array.length) / Math.log(2)));
        // Calculate the size of the segment tree array
        int size = 2 * m - 1;
		this.array = new int[size];
		Arrays.fill(this.array, 0);
		for(int i=0;i<length;i++) {
			this.array[i]=array[i];
		}
		
	}
	
	public int[] getArray() {
		return this.array;
	}
	
	
}
