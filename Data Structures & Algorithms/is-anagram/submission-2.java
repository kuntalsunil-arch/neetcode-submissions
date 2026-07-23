class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;

        Map sMap =new HashMap<Character ,Integer>(); 
        Map tMap =new HashMap<Character ,Integer>();

        char[] tAr =t.toCharArray();
        char[] sAr =s.toCharArray();  

        for(int i=0;i<sAr.length;i++){
            char  si= sAr[i];
            if(sMap.containsKey(si)){
            int freq =(Integer) sMap.get(si);
            freq++;
            sMap.put(si,freq);
            }else{
                sMap.put(si,1);
            }
        }

        for(int k=0;k<tAr.length;k++){
             char  si= tAr[k];
            if(tMap.containsKey(si)){
            int freq = (Integer)tMap.get(si);
            freq++;
            tMap.put(si,freq);
            }else{
             tMap.put(si,1);
            }
        }

           for(int j=0;j<sAr.length;j++){
            char  si= sAr[j];
            if(sMap.containsKey(si) && tMap.containsKey(si)){
                if(!sMap.get(si).equals(tMap.get(si)))
                    return false;

            }else return false;
        }
        return true;
       
    }
}
