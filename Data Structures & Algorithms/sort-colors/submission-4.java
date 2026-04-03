class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        for( int num: nums){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low += 1;
                mid += 1;
            }else if(nums[mid] == 1){
                mid += 1;
            }else{
                swap(nums, mid, high);
                high -= 1;
            }
        }

    }
    public void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}