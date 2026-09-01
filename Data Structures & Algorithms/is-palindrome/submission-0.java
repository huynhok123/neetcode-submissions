class Solution {
    public boolean isPalindrome(String s) {
        String format = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right
                && (!((format.charAt(left) >= 'a' && format.charAt(left) <= 'z')
                    || (format.charAt(left) >= '0' && format.charAt(left) <= '9')))) {
                left++;
            }
            while (left < right
                && (!((format.charAt(right) >= 'a' && format.charAt(right) <= 'z')
                    || (format.charAt(right) >= '0' && format.charAt(right) <= '9')))) {
                right--;
            }

            if (format.charAt(left) != format.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
