/*53. Maximum Subarray

Medium

Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104*/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE; // Initialize max to the smallest possible value
        for(int i=0;i<nums.length;i++){ // Iterate through the array to find the maximum element
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){ // Iterate through the array to find the maximum subarray sum
            if(nums[i]+sum<0){ // If the current element plus the sum is negative, reset the sum
                sum=0;
                continue; 
            }else{ 
                sum+=nums[i]; // Add the current element to the sum
                max=Math.max(sum,max);  // Update max if the current sum is greater than max
            }
        }
        return max;
    }
}