class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String word : strs){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            res.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(res.values());
    }
}
