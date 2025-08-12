import java.util.*;
class Solution {

    public String encode(String s[]) {
        // write your logic to encode the strings
        String res = "";
        for (String str : s){
            res += str.length()+"#"+str;
            
        }
        return res;
    }

    public String[] decode(String s) {
        // write your logic to decode the string
        List<String> res = new ArrayList<>();
        
        int i =0;
        while(i<s.length()){
            int j = i;
            while(s.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(s.substring(i,j));
            res.add(s.substring(j+1,j+1+len));
            i = j+1+len;
        }
        String [] out = res.toArray(new String[0]);
        return out;
    }
}