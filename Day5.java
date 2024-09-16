class Solution{
    public static int max(int i , int j){
        if(i > j){
            return i;
        }
        
        
        return j;
    }
    static int maxLength(String s){
        Stack<Integer> st = new Stack<>();
        
        st.push(-1);
        int maxLen =0;
        
        for(int i =0 ;i<s.length() ; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else{
                st.pop();
                
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    maxLen = max(maxLen , i - st.peek());
                }
            }
            
            
        }
        
        return maxLen;
    }
}
