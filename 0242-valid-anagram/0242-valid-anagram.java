import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() == t.length()){
            char [] scharacter = s.toCharArray();
            char [] tcharacter = t.toCharArray();

            Arrays.sort(scharacter);
            Arrays.sort(tcharacter);

            
            if( Arrays.equals(scharacter,tcharacter)){
                return true;
            }else{
                return false;
            }
        }
     else{
            return false;
        }

    }
}