class Solution {

    /**

    **/

    public List<List<String>> groupAnagrams(String[] strs) {
         Map outputMap = new HashMap<String,List<String>>();
         for(int i=0;i<strs.length;i++){
            String key = strs[i];
            char[] keyCharArray= key.toCharArray();
            Arrays.sort(keyCharArray);
            String sortedkey= new String(keyCharArray);
            List<String> value= (List<String>)outputMap.getOrDefault(sortedkey, new ArrayList<String>());
            value.add(key);
            outputMap.put(sortedkey,value) ;
         }
        List output = new ArrayList<List<String>>();
        output.addAll(outputMap.values());
        return output;
    }
}
