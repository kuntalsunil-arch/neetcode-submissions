class Solution {
    public boolean isPalindrome(String s) {
        if(s ==null || s.length()<1)
        return false;
    int i=0;
    int j=s.length()-1;
    while(i<j){
    while(i<j &&!isAlphanumeric(s.charAt(i))){
            i++;
        }
    while(i<j && !isAlphanumeric(s.charAt(j))){
            j--;
        }
    
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        
        
    }
    return true;
    }

    private boolean isAlphanumeric(char c){
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
