class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> op = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){

            if(nums[i]>0)
            break;

            if (i > 0 && nums[i] == nums[i - 1]) 
             continue;
            int j =i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k] == -nums[i]){
                    op.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(nums[j] ==nums[j-1] && j<=k){
                        j++;
                    }
                    while(nums[k] ==nums[k+1] && k>=j){
                        k--;
                    }
                }
                if(nums[j]+nums[k] > -nums[i]){
                    k--;
                }
                if(nums[j]+nums[k] < -nums[i]){
                    j++;
                }
               

            }
        }
        return op;
    }
}
