class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set set = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;
    }
}