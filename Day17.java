class Solution {
    public int minimizeCost(int k, int heights[]) {
        int n = heights.length;
        int[] dp = new int[n];  // Adjust the dp array size to match the heights array size
 
        dp[0] = 0;  // Starting point, no cost
        if (n > 1) {
            dp[1] = Math.abs(heights[1] - heights[0]);  // First jump
        }
        
        // Loop through the array and calculate the minimum cost for each step
        for (int i = 2; i < n; i++) {
            int x = Integer.MAX_VALUE;
            // For each step, check the last k jumps to find the minimum cost
            for (int j = Math.max(0, i - k); j < i; j++) {
                x = Math.min(x, Math.abs(heights[i] - heights[j]) + dp[j]);
            }
            dp[i] = x;  // Store the minimum cost for reaching step i
        }
 
        return dp[n - 1];  // Return the minimum cost to reach the last step
    }
}