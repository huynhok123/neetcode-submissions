class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] travesal = new int[26];
        for (int i = 0; i < s.length(); i++) {
            travesal[s.charAt(i) - 'a']++;
            travesal[t.charAt(i) - 'a']--;
        }
        for(int n : travesal){
            if(n != 0) return false;
        }
        return true;
    }
}
