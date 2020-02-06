package findsortedtarget;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,4,5};
			
		int target = 2;
		
		System.out.println("Input: " + Arrays.toString(nums) + " with target of " + target);
		
		FindStartAndEndOfTargetFunction solution = new FindStartAndEndOfTargetFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.searchRange(nums, target)));
	}
}
