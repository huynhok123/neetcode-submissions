class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> consecutiveSequence = new HashSet<>();
        for(int num : nums){
            consecutiveSequence.add(num);
        }
        int longest = 0;
        for(int num : consecutiveSequence){
            if(!consecutiveSequence.contains(num - 1))
            {int length = 1;
            while(consecutiveSequence.contains(num + length)){
                length++;
            }
            longest = Math.max(longest, length);}
        }
        return longest;
    }
}
