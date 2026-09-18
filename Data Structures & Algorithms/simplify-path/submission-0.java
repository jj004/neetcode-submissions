class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        System.out.println("arr = " + java.util.Arrays.toString(arr));
        Stack<String> can = new Stack<>();

        for(String s : arr) {
            if(s.isEmpty() || s.equals(".")) {
                continue;
            } 
            if(s.equals("..")){
                if(!can.isEmpty()){
                    can.pop();
                }
            } else{
                can.push(s);
            }
        }

        if(can.isEmpty()){
            return "/";
        }

        StringBuilder canPath = new StringBuilder();
        for(String data : can) {
            canPath.append("/").append(data);
        }

        return canPath.toString();
    }
}