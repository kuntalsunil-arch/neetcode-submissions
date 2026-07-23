class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map map =new HashMap<Integer,Integer>();   

      for(int i=0;i<nums.length;i++){
        int value = nums[i];
        int complement =target-value;

        if(map.containsKey(complement)){
            return new int[]{(int)map.get(complement),i};
        }else{
            map.put(value,i);
        }
      } 
       return new int[] {-1,-1};
    }
}
