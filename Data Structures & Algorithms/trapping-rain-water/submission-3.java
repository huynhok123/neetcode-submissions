class Solution {
    public int trap(int[] height) {
        if(height.length < 3) return 0;
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while (l < r && height[l] <= height[l + 1]) l++;
        while (l < r && height[r] <= height[r - 1]) r--;
        int maxl = height[l];
        int maxr = height[r];
        while (l < r) {
            if (height[l] <= height[r]) {
                l++;
                if (height[l] < maxl) {
                    res += maxl - height[l];
                } else {
                    maxl = height[l];
                }
            } else {
                r--;
                if (height[r] < maxr) {
                    res += maxr - height[r];
                } else {
                    maxr = height[r];
                }
            }
        }
    return res;
    }
}
