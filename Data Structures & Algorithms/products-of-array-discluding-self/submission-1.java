class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productOfArray = 1;
        for (int i = 0; i < nums.length; i++) {
            productOfArray *= nums[i];
        }
        int res[] = new int[nums.length];

        if (productOfArray != 0) {
            for (int i = 0; i < res.length; i++) {
                res[i] = productOfArray / nums[i];
            }
        } else {
            productOfArray = 1;
            int count0 = 0;
            int index0 = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count0++;
                    index0 = i;
                }
            }
            if (count0 > 1) {
                return new int[nums.length];
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if(index0 == i) continue;
                    productOfArray *= nums[i];
                }
                res[index0] = productOfArray;
                return res;
            }
        }

        return res;
    }
}
