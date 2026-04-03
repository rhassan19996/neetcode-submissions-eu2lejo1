class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int candidate = 0;

        for(int num : nums){
            if(candidate == num){
                majority += 1;
            }
            else if(majority == 0){
                candidate = num;
                majority += 1;
            }else{
                majority -=1;
            }
        }
        return candidate;
    }
}