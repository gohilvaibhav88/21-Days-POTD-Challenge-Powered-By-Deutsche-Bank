class Solution {
    void rearrange(ArrayList<Integer> nums) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i =0 ;i<nums.size() ; i++){
            if(nums.get(i) < 0){
                neg.add(nums.get(i));
            }
            if(nums.get(i) >= 0){
                pos.add(nums.get(i));
            }
        }
        
        if(pos.size() > neg.size()){
            for(int i =0 ; i<neg.size(); i++){
                nums.set(i*2 , pos.get(i));
                nums.set(i*2+1 , neg.get(i));
            }
            int idx = neg.size()*2; // because the all pos and neg element will be double the smallest array
            for(int i = neg.size() ; i<pos.size() ; i++){
                nums.set(idx , pos.get(i));
                idx++;
            }
        }else{
            for(int i =0 ; i<pos.size(); i++){
                nums.set(i*2 , pos.get(i));
                nums.set(i*2+1 , neg.get(i));
            }
            int idx = pos.size()*2; // because the all pos and neg element will be double the smallest array
            for(int i = pos.size() ; i<neg.size() ; i++){
                nums.set(idx , neg.get(i));
                idx++;
            }
        }
    }
}