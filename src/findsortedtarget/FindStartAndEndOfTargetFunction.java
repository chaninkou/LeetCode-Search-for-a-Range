package findsortedtarget;

public class FindStartAndEndOfTargetFunction {
	public int[] searchRange(int[] nums, int target) {
		// Find the starting index if exist first
		int start = findStartOfTarget(nums, target);
		
		// Make sure to check if start will be overflow first
		// Return bad when its not the target
		if(start == nums.length || nums[start] != target){
			int[] notFound = {-1,-1};
			return notFound;
		}
		
		// since its sorted, target + 1 will get the next index of the end of the target, - 1 to get the correct index after
		int end = findStartOfTarget(nums, target + 1) - 1;
		
		int[] solution = {start,end};
		
		return solution;
	}
	
	// This part is similar to binary search, which get o(logn) solution
	private int findStartOfTarget(int[] nums, int target){
		int low = 0;
		
		// Not nums.length - 1 in case there is only one element
		int high = nums.length;
		
		while(low < high){
			int mid = low + (high - low)/2;
			
			if(nums[mid] >= target){
				high = mid;
			} else if (nums[mid] < target){
				low = mid + 1;
			}
		}
		
		return low;
	}
}
