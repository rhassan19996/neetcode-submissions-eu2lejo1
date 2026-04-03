class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int n : nums){
            numset.add(n);
        }
        int longest = 0;

        for(int num : numset){
            if(!numset.contains(num -1)){
                int current_sum = 0;
                while(numset.contains(current_sum + num)){
                    current_sum += 1;
                    longest = Math.max(current_sum, longest);
                }
            }
        }
        return longest;

    }
}
