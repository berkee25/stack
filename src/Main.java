class exercise {
    int max;
    int top;
    int [] arr;

    exercise (int max){
        this.arr = new int[max];
        this.max = max;
        this.top = -1;
    }
    public void push(int val) {
        if (top >= max-1) {
            System.out.println("stacks overflow");
        }else {
            arr[++top] = val;
            System.out.println(val + " pushed into stack");
        }
    }
    public int pop() {
        if (top < 0) {
            System.out.println("stacks overflow");
            return -1;
        }else {
            int val = arr[top--];
            System.out.println(val + " popped from stack");
            return val;
        }
    }
    public int peek() {
        if (top < 0) {
            System.out.println("Stacks overflow");
            return -1;
        }else {
            return arr[top];
        }
    }
    public static void main(String[] args) {
        exercise s = new exercise(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element: " + s.peek());
        s.pop();
        s.pop();
        s.pop();
        s.pop(); // boşken pop
    }
}
