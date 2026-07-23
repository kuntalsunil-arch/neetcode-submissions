class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums ==null || nums.length<1)
            return 0;
            if(nums.length ==1)
            return 1;
    
        int maxCount=0;
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i] <2){
                if(nums[i+1]-nums[i] ==1){
                   count++;
                }
            }else{
                if(count>maxCount){
                    maxCount=count;
                }
                count =0;
            }
             if(count>maxCount){
                maxCount=count;
            }

        }
        return maxCount+1;
    }
}
