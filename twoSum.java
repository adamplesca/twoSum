class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
             // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If the complement exists, return its index and the current index
                return new int[] { map.get(complement), i };
            }
             // Add the current number and its index to the map
            map.put(nums[i], i);
        }
        // If no solution is found, return [-1, -1]
        return new int[] {-1, -1};
    }
}
