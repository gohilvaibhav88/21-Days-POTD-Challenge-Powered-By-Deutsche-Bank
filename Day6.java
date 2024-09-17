class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        // Sort the array
        Arrays.sort(arr);
        
        // Initial maximum difference between the largest and smallest element
        int ans = arr[n - 1] - arr[0];
        
        // Calculate the smallest and largest possible heights after adding/subtracting k
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        
        int max = 0, min = 0;
        
        // Loop through the array
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(smallest, arr[i + 1] - k);
            max = Math.max(largest, arr[i] + k);
            
            // Update the answer only if min is positive
            if (min >= 0) {
                ans = Math.min(ans, max - min);
            }
        }
        return ans;
    }
}
