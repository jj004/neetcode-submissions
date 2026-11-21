class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String str : strArr){
            int i = 0;
            int j = str.length() - 1;
            char[] chars = str.toCharArray();
            while(i < j){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            result.append(new String(chars)).append(" ");
        }

        return result.toString().trim();
    }
}
