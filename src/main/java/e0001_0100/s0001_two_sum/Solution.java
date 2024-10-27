package e0001_0100.s0001_two_sum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store elements and their indices
        Map<Integer, Integer> indexMap = new HashMap<>();

        // Iterates through the array
        for (int i = 0; i < nums.length; i++) {
            Integer requiredNum = target - nums[i];
            // Check if the complement exists in the hashmap
            if (indexMap.containsKey(requiredNum)) {
                // Return the indices of the current element and the complement
                return new int[]{indexMap.get(requiredNum), i};
            }
            // Add the current element and its index to the hashmap
            indexMap.put(nums[i], i);
        }
        // If no solution is found, return an empty array or null
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Output: " + result1[0] + ", " + result1[1]);
    }
}
