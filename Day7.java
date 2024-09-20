class Day7
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        
        Stack<Character> st = new Stack<>();
        
        
        for(int i =0 ; i<x.length() ; i++){
            
            char current = x.charAt(i);
            
            if((!st.isEmpty() && current ==']') && st.peek() == '['){
                st.pop();
            }
            else if((!st.isEmpty() && current =='}') && st.peek() == '{'){
                st.pop();
            }
            else if((!st.isEmpty() && current ==')') && st.peek() == '('){
                st.pop();
            }else{
                st.push(current);
            }
            
            
        }
        
        
        
        
        return st.isEmpty();
    }
}
