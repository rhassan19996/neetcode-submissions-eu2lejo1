class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        int mid = nums.length / 2;
        int [] leftSide = Arrays.copyOfRange(nums, 0, mid);
        int [] rightside = Arrays.copyOfRange(nums, mid, nums.length);

        int [] leftsorted = sortArray(leftSide);
        int [] rightsorted = sortArray(rightside);
        List<Integer> newlist = new ArrayList<>();

        int i =0, j = 0;
        while(i < leftsorted.length && j < rightsorted.length){
            if(leftsorted[i] < rightsorted[j]){
                newlist.add(leftsorted[i]);
                i++;
            }else{
                newlist.add(rightsorted[j]);
                j++;

            }
        }
        while(i < leftsorted.length){
            newlist.add(leftsorted[i]);
            i++;
        }
        while(j < rightsorted.length){
            newlist.add(rightsorted[j]);
            j++;
        }
        int []result = new int [newlist.size()];
        for (int k = 0; k < newlist.size(); k++){
            result[k] = newlist.get(k);
            
        }
        return result;
    }
}