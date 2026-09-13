class MyStack {

    Deque<Integer> sq;

    public MyStack() {
        sq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        sq.add(x);
    }
    
    public int pop() {
        return sq.removeLast();
    }
    
    public int top() {
        return sq.getLast();
    }
    
    public boolean empty() {
        return sq.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */