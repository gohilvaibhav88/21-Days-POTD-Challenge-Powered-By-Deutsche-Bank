class Solution {
    boolean isPalindrome(Node head) {
        
        Node temp = head;
        int count = 0;
        
        
        while(temp != null){
            count = count+1;
            temp = temp.next;
        }
        
        int arr[] = new int[count];
        int idx = 0;
        temp = head;
        
        
        while(temp != null){
            arr[idx] = temp.data;
            temp = temp.next;
            idx++;
        }
        
        int i =0 ;
        int j = arr.length-1;
        while(i < j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        
        
        return true;
        
    }
}
