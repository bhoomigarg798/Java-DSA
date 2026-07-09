// LeetCode 1: Two Sum
// Difficulty: Easy
// Approach: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
            if(nums[i]+nums[j]==target) {
                arr[0] = i;
                arr[1] = j;
            }
           }
        }
        return arr;
    }
}
