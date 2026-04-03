class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1){
            return nums;
        }
        int mid = nums.length / 2;
        int [] leftside = Arrays.copyOfRange(nums, 0, mid);
        int [] rightside = Arrays.copyOfRange(nums, mid, nums.length);

        int [] leftSort = sortArray(leftside);
        int [] rightSort = sortArray(rightside);
        List<Integer> newlist = new ArrayList<>();

        int i =0, j = 0;
        while(i < leftSort.length && j < rightSort.length){
            if(leftSort[i] < rightSort[j]){
                newlist.add(leftSort[i]);
                i++;
            }else {
                newlist.add(rightSort[j]);
                j++;
            }
        }
        while(i < leftSort.length){
            newlist.add(leftSort[i]);
            i++;
        }
        while(j < rightSort.length){
            newlist.add(rightSort[j]);
            j++;
        }
        int [] result = new int [newlist.size()];
        for(int k = 0; k < newlist.size(); k++){
            result[k] = newlist.get(k);
        }
        return result;
    }
}