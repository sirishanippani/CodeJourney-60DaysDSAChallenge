class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int windowSum = 0;
        
        for (int i = 0;i < k; i++){
            windowSum += nums[i];
        }

        int maxWinSum = windowSum;
        for (int i = 1; i <= n-k; i++) {
            windowSum += nums[i+k-1] - nums[i-1];
            maxWinSum = Math.max(maxWinSum, windowSum);
        }

        return (double)maxWinSum/(double)k;
    }
}