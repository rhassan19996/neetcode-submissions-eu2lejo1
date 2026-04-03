class Solution {
    public int[] sortArray(int[] nums) {
        //create base case
        //split the array
        //recursively sort the array from left and right
        if(nums.length <= 1 ){
            return nums;
        }
        int mid = nums.length / 2;
        int [] leftside = Arrays.copyOfRange(nums, 0, mid);
        int [] rightside = Arrays.copyOfRange(nums, mid, nums.length);

        int [] leftSorted = sortArray(leftside);
        int [] rightSorted = sortArray(rightside);

        List<Integer> newlist = new ArrayList<>();
        int i = 0, j = 0;

        while(i < leftSorted.length && j < rightSorted.length){
            if(leftSorted[i] < rightSorted[j]){
                newlist.add(leftSorted[i]);
                i++;
            }
            else{
                newlist.add(rightSorted[j]);
                j++;
            }
        }
        while (i < leftSorted.length){
            newlist.add(leftSorted[i]);
            i++;
        }
        while(j < rightSorted.length){
            newlist.add(rightSorted[j]);
            j++;
        }
        int [] newArray = new int[newlist.size()];
        for(int k = 0; k< newArray.length; k++ ){
            newArray[k] = newlist.get(k);

        }
        return newArray;
    }
}