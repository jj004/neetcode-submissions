class Solution {
    public int compress(char[] chars) {
        int count = 0;
        int i = 0;
        int j = 0;
        StringBuilder s = new StringBuilder();
        while(i < chars.length){
            while(j < chars.length && chars[i] == chars[j]){
                count++;
                j++;
            }
            s.append(chars[i]);
            if(count > 1){
                s.append(count);
            }
            count = 0;
            i = j;
        }

        for(int k = 0; k < s.length(); k++){
            chars[k] = s.charAt(k);
        }

        return s.length();
    }
}