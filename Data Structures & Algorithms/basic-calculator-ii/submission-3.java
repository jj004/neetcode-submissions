class Solution {
    public int calculate(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                StringBuilder sb = new StringBuilder();
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    sb.append(s.charAt(i));
                    i++;
                }
                val.push(Integer.parseInt(sb.toString()));
                i--;
            } else if(ch == '*' || ch == '/' || ch == '+' || ch == '-'){
                while(!op.isEmpty() && this.hasPrecedence(ch, op.peek())){
                    val.push(this.applyOperation(op.pop(), val.pop(), val.pop()));
                }
                op.push(ch);
            }
        }

        while(!op.isEmpty()){
            val.push(this.applyOperation(op.pop(), val.pop(), val.pop()));
        }

        return val.pop();
    }

    private boolean hasPrecedence(char op1, char op2){
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    private int applyOperation(char op, int b, int a){
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };

    }
}