class Solution {
    public int maxArea(int[] heights) {
    

        int left=0;
        int right =heights.length-1;
        int minHeighta = Math.min(heights[left],heights[right]);
        int maxWater = minHeighta*(right-left);
       while(left<right){
        int minHeight = Math.min(heights[left],heights[right]);
        int currentWater = minHeight*(right-left);
        if(currentWater>maxWater){
         maxWater = currentWater;
        }
        if(heights[left] <heights[right]){
            left++;
        }else{
            right--;
        }
       

    }
     return maxWater;
    }
}
