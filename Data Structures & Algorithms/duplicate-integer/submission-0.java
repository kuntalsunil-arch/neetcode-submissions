class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map numsMap = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(numsMap.containsKey(num)){
                return true;
            }else{
                numsMap.put(num,i);
            }
        }
        return false;
    }
}