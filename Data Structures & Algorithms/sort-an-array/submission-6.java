class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length <=1){
            return nums;
        }
        int mid = nums.length /2 ;
        int []leftside = Arrays.copyOfRange(nums, 0, mid);
        int [] rightside = Arrays.copyOfRange(nums, mid, nums.length);

        int []leftsort = sortArray(leftside);
        int [] rightsort = sortArray(rightside);
        List<Integer> newlist = new ArrayList<>();

        int i= 0, j = 0;

        while(i < leftsort.length && j < rightsort.length){
            if(leftsort[i] < rightsort[j]){
                newlist.add(leftsort[i]);
                i++;
            }else{
                newlist.add(rightsort[j]);
                j++;
            }
            
        }
        while(i < leftsort.length){
            newlist.add(leftsort[i]);
            i++;
        }
        while(j < rightsort.length){
            newlist.add(rightsort[j]);
            j++;
        }
        int [] result = new int [newlist.size()];
        for(int k = 0; k < newlist.size(); k++){
            result[k] = newlist.get(k);

        }
        return result;
    }
}