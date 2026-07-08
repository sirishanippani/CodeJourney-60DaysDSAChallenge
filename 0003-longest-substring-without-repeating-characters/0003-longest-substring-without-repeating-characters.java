class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int l = 0, r = 0;
        int result = 0;
        while (r < s.length()) {
            while (window.contains(s.charAt(r))) {
                window.remove(s.charAt(l));
                l++;
            }
            window.add(s.charAt(r));
            result = Math.max(result, (r - l + 1));
            r++;
        }

        return result;
    }
}