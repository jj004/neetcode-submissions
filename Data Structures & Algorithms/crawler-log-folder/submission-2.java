class Solution {
    public int minOperations(String[] logs) {
        String main = logs[0];
        Stack<String> st = new Stack<>();
        int count = 0;

        for(String folder : logs){
            if(!st.isEmpty() && !main.equals(st.peek()) && folder.equals("../")){
                st.pop();
            }
            if(!folder.equals("./")){
                st.push(folder);
            }
        }

        while(!st.isEmpty() && !main.equals(st.peek())){
            st.pop();
            count++;
        }

        return count;
    }
}