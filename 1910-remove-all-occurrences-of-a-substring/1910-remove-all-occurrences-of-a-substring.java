class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();

        int m = part.length();
        for(char ch : s.toCharArray()){
            sb.append(ch);

            if(sb.length()>=m){
                String last = sb.substring(sb.length() - m);

                if(last.equals(part)){
                    sb.delete(sb.length() - m , sb.length());
                }
            }
        } 
        return sb.toString();  
    }
}