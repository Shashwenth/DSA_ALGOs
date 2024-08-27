package runner;

import java.util.Arrays;

import Initialization.arrayInit;
import operation.Build;
import operation.Update;
import operation.query;

public class Main {

	public static void main(String[] args) {
		
		
		Runtime runtime = Runtime.getRuntime();
		long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used Memory in bytes: " + memoryBefore);
		
        
		int[] arr=new int[] {0,1,2,3,4,5};
		arrayInit at=new arrayInit(arr, arr.length);
		int[] array=at.getArray();
		
		Build ba=new Build();
		ba.build(array, 0, arr.length-1, 0, arr);
		ba.print(array);
		
		query qa=new query();
		int ans=qa.compute(array, 0, arr.length-1, 0, 5, 0);
		System.out.println("Answer for sum of range [0:5] inclusive is : "+String.valueOf(ans));
		
		
		Update ua=new Update();
		ua.setOriginalArray(arr, 5, 1);
		ua.update(array, 0, arr.length-1, 5, 0, 1);
		System.out.println("New updated array for idx 5 val to 1 is "+Arrays.toString(arr));
		ba.print(array);
		ans=qa.compute(array, 0, arr.length-1, 0, 5, 0);
		System.out.println("Answer for sum of range after updation [0:5] inclusive is : "+String.valueOf(ans));
		
		long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used Memory in bytes after execution: " + memoryAfter);

        // Memory used by your code
        long memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memory used by your code in bytes: " + memoryUsed);
		
	}
	
}
