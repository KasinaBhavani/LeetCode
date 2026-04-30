class MinStack {
    Stack<Integer> st;
    Stack<Integer> Minst;
    public MinStack() {
        st = new Stack<>();
        Minst = new Stack<>();
    }
    
    public void push(int val) {
        if(Minst.isEmpty() ||  val<=Minst.peek())
           Minst.push(val);
        st.push(val);
    }
    
    public void pop() {
        if(!Minst.isEmpty() && st.peek().equals(Minst.peek()))
           Minst.pop();
        st.pop();
    }
    
    public int top() {
         return st.peek();
    }
    
    public int getMin() {
        return Minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */