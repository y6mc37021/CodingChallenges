package com.leet.code.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
			Example 1:
			Input: nums = [1,2,3,1]
			Output: true
			
			Example 2:
			Input: nums = [1,2,3,4]
			Output: false
			
			Example 3:
			Input: nums = [1,1,1,3,3,4,3,2,4,2]
			Output: true
			 
			Constraints:
			1 <= nums.length <= 105
			-109 <= nums[i] <= 109*/

	public static void main(String[] args) {
		int[] arr = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(arr));
	}
	public static boolean containsDuplicate(final int[] nums) {
	    Set<Integer> found = new HashSet<>();
	    for (final int num : nums)
	      if (!found.add(num))
	        return true;
	    return false;
	  }
	
	

}
