class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] str1 = s.toCharArray(); 
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(new String(str1).equals(new String(str2))){
            return true;
        }
        return false;
    }
}
