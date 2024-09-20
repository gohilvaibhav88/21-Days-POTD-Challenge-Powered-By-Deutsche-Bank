class Day8 {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        String arr[] = str.split("\\.");
        
        int i =0 ;
        int j = arr.length-1;
        
        
        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
        
        StringBuilder newstr = new StringBuilder();
        
        
        for(int k=0 ; k<arr.length ; k++){
            newstr.append(arr[k]);
            
            if(k != arr.length-1){
                
                newstr.append('.');
            }
            
            
        }
        
        return newstr.toString();
        
        
    }
}