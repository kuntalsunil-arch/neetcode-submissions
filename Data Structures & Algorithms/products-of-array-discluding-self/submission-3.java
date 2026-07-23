class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length ==0)
        {
            return new int[]{};
        }
        int mult =1;
        int zeroCount =0;
        int[] op= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                mult= mult*nums[i];
            }
            else{
               zeroCount++;
                }
        }
          for(int j=0;j<nums.length;j++){
            if(nums[j] ==0){
                if(zeroCount>1){
                    op[j]=0;
                }else{
                    op[j]=mult;
                }
               
            }else{
                if(zeroCount>0)
                op[j] =0;
                else
                op[j]=mult/nums[j];
            }
        }
        return op;
    }
}  
