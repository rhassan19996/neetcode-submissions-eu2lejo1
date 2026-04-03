class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> newmap = new HashMap<>();

        for ( int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(newmap.containsKey(compliment)){
                return new int [] {newmap.get(compliment), i};
            }
            else{
                newmap.put(nums[i], i);
            }
        }
        return new int [] {};
    }

}
