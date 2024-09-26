class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
       
       
       int count=0 ;
       int max = 0 ;
       
       for(int i=1 ;i<arr.length ; i++){
           if(arr[i] > arr[i-1]){
               count++;
           }else{
               max = Math.max(max , count);
               count=0;
           }
       }
       
       
       max = Math.max(count , max);
       
       return max;
    }
}
