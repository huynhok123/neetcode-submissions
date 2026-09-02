class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        int left = 0;
        while(left < right){
            int sum = numbers[right] + numbers[left];
            if(sum == target){
                return new int[] {left + 1, right + 1};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[0];
    }
}
