class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       if(nums.length<k)
        return new int[0];

        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        for(int n : nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }

        List<int[]> sortedList=new ArrayList();
        
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
          sortedList.add(new int[]{entry.getValue(),entry.getKey()});
        }
        sortedList.sort((a,b)->b[0]-a[0]);
        int[] op=new int[k];
        for(int i=0;i<k;i++){
            op[i] =sortedList.get(i)[1];
        }
        return op;
    }
}
