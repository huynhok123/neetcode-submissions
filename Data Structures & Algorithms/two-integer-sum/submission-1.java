class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store the number and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If we have already seen the complement, we found our pair!
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            
            // Otherwise, add the current number and its index to the map
            numMap.put(nums[i], i);
        }
        
        return new int[] {}; // Fallback return
    }
}