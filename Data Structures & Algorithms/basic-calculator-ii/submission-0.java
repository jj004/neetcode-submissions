class Solution {
    public int calculate(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                val.push(Integer.parseInt(""+ch));
            } else if(ch == '*' || ch == '/' || ch == '+' || ch == '-'){
                while(!op.isEmpty() && this.hasPrecedence(ch, op.peek())){
                    val.push(this.applyOperation(ch, val.pop(), val.pop()));
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
        if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')){
            return false;
        }
        return true;
    }

    private int applyOperation(char op, int b, int a){
        switch(op){
            case '+': 
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default: break;
        }

        return 0;
    }
}