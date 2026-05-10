class Solution {
    public int[] twoSum(int[] nums, int target) {
        int leng = nums.length;
        for(int i = 0; i < leng; i++){
            for(int j = i + 1; j < leng; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
