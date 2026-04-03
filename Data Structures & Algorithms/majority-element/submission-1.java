class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0, candidate = 0;

        for (int i =0 ; i < nums.length; i++){
            if (nums[i] == candidate){
                majority += 1;
            }
            else if(majority == 0){
                candidate = nums[i];
                majority = 1;
            }
            else{
                majority -= 1;
            }
        }
        return candidate;
    }
}