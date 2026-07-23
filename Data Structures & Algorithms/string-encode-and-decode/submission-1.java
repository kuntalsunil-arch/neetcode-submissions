class Solution {


    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            int l =s.length();
            sb.append(l);
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
         List<String> res= new ArrayList();
         if (str.length() == 0) {
           return res;
        }
        
        for (int i=0;i<str.length();){
            StringBuilder sb = new StringBuilder();
            int j=i;
            while(str.charAt(j)!='#'){
                sb.append(str.charAt(j++));
            }
            int length =Integer.parseInt(sb.toString());
            res.add(str.substring(j+1,j+length+1));
            i=j+length+1;
        }
        return res;
    }
}
