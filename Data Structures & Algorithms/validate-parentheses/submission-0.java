class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> data = new Stack<>();
        Map<Character, Character> lib = Map.of(')', '(', ']','[', '}','{');

        for(int i = 0; i < s.length(); i++){
            if(lib.containsValue(s.charAt(i))){
                data.push(s.charAt(i));
            }
            if(lib.containsKey(s.charAt(i)) && !data.isEmpty() && data.peek() == lib.get(s.charAt(i))){
                data.pop();
            }
        }

        return data.isEmpty();
    }
}
