/*540. Single Element in a Sorted Array

Medium

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left =0;
        int right =nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;

            if(nums[mid]==nums[mid+1]){
                mid=mid-1;
            }
            int leftpartlength=(mid-left)+1;
            if(leftpartlength%2==1){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return nums[left];
    }
}