class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> data = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#' && !data.isEmpty()){
                data.pop();
            } else if(c != '#'){
                data.push(c);
            }
        }
        s = data.isEmpty() ? "" : data.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        data.clear();
        for(char c : t.toCharArray()){
            if(c == '#' && !data.isEmpty()){
                data.pop();
            } else if(c != '#'){
                data.push(c);
            }
        }
        t = data.isEmpty() ? "" : data.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        return s.equals(t);
    }
}
