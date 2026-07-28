class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        if(s.length() ==0 )
        return maxLength;

        if(s.length() ==1)
        return 1;

       
        for(int i=0;i<s.length()-1;i++){
        Set<Character> set= new HashSet<Character>();
        set.add(s.charAt(i));
         for(int j=i+1;j<s.length();j++){
            char c =s.charAt(j);
            if(set.contains(c))
             break;
            else
                set.add(c);
            
         }
         if(maxLength<set.size()){
            maxLength=set.size();
         }
        }
        return maxLength;
    }
}
