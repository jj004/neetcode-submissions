class Solution {
    public int minOperations(String[] logs) {
        String main = logs[0];
        Stack<String> st = new Stack<>();
        int count = 0;

        for(String folder : logs){
            if(!st.isEmpty() && folder.equals("../")){
                st.pop();
            } else if(!folder.equals("./") && !folder.equals("../")){
                st.push(folder);
            }
        }

        while(!st.isEmpty()){
            st.pop();
            count++;
        }

        return count;
    }
}