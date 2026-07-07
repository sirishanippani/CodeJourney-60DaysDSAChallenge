class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> count = new HashMap<>();

        for (int n : nums) {
            if (count.containsKey(n)) {
                return true;
            }
            count.put(n, true);
        }
        return false;

    }
}