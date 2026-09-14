class MyQueue {

    Stack<Integer> prim;
    Stack<Integer> seco;

    public MyQueue() {
        prim = new Stack<>();
        seco = new Stack<>();
    }
    
    public void push(int x) {
        prim.push(x);
        seco.clear();
        ListIterator<Integer> listIterator = prim.listIterator(prim.size());
        while (listIterator.hasPrevious()) {
            seco.push(listIterator.previous());
        }
    }
    
    public int pop() {
        int val = seco.pop();
        prim.clear();
        ListIterator<Integer> listIterator = seco.listIterator(seco.size());
        while (listIterator.hasPrevious()) {
            prim.push(listIterator.previous());
        }
        return val;
    }
    
    public int peek() {
        return seco.peek();
    }
    
    public boolean empty() {
        return seco.isEmpty() || prim.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */