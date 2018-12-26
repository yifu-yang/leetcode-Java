class MinStack {

    private ArrayList<Integer> array;
    
    /** initialize your data structure here. */
    public MinStack() {
        array = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        array.add(x);
    }
    
    public void pop() {
        int length = array.size();
        array.get(length-1);
        array.remove(length-1);
    }
    
    public int top() {
        int length = array.size();
        return array.get(length-1);
    }
    
    public int getMin() {
        int min = 0;
        for(int i=0;i<array.size();i++){
            if(i==0){
                min = array.get(i);
            }
            if(array.get(i)<min){
                min = array.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */