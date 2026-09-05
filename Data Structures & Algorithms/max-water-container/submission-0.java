class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;
        while (l < r) {
            int width = r - l;
            int height = Math.min(heights[l], heights[r]);
            int area = width * height;
            if (res < area) {
                res = area;
            }
            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return res;
    }
}
