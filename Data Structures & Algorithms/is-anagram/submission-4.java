class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;

        Map sMap =new HashMap<Character ,Integer>(); 
        Map tMap =new HashMap<Character ,Integer>();

        for(int i=0;i<s.length();i++){
             sMap.put(s.charAt(i), ((int)sMap.getOrDefault(s.charAt(i), 0)) + 1);
            tMap.put(t.charAt(i), ((int)tMap.getOrDefault(t.charAt(i), 0) )+ 1);
        }        
        return sMap.equals(tMap);
       
    }
}
