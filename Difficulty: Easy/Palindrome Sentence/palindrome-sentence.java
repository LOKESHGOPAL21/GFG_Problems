class Solution {
    public static boolean isAlphaNum(char ch){
        return(
            (ch>='a' && ch<='z') ||
            (ch>='A' && ch<='Z') ||
            (ch>='0' && ch<='9')
            );
    }
    
    public boolean isPalinSent(String s) {
        // code here
        int l=0,r=s.length()-1;
        while(l<r){
            while(l<r && !isAlphaNum(s.charAt(l))) l++;
            while(l<r && !isAlphaNum(s.charAt(r))) r--;
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    
}