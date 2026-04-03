class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int n: nums){
            if ( numset.contains(n)){
                return true;
            }else{
                numset.add(n);
            }
        }
        return false;
    }
}