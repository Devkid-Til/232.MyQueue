class MyQueue {

    private ArrayStack<Integer> data;
    private int frontValue;
    /** Initialize your data structure here. */
    public MyQueue() {
        data = new ArrayStack<>();
        frontValue = 0;

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        ArrayStack<Integer> data2 = new ArrayStack<>();
        while(!data.isEmpty()) {
            data2.push(data.pop());
        }
        data.push(x);
        while(!data2.isEmpty()) {
            data.push(data2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return data.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (empty())
            throw new IllegalArgumentException("Empty queue.");
        return data.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
//        StringBuilder res = new StringBuilder();
//        res.append(String.format("Queue: size = %d capacity = %d\n", data.getSize(), data.getCapacity()));
//        res.append("tail [");
//        for (int i = 0; i < data.getSize(); i ++) {
//        }
        return data.toString();
    }


    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        for (int i = 0; i < 11; i ++) {
            obj.push(i);
            System.out.println(obj.toString());
        }

        System.out.println();
        for (int i = 0; i < 5; i ++) {
            System.out.println("Queue:" + obj.pop());
            System.out.println(obj.toString());
        }

        System.out.println(obj.peek());
        System.out.println("Queue:" + obj.pop());
        System.out.println("Queue:" + obj.pop());
        System.out.println(obj.toString());

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