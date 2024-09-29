class Solution {
    int totalCount(int k, int[] arr) {
    
        int sum =0;
        
        for(int i =0 ; i<arr.length ; i++){
            
                
                sum = sum + arr[i]/k;
                
                if(arr[i] % k != 0){
                    sum++;
                }
            
        }
        
        
        return sum;
    }
}