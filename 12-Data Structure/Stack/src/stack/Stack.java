package stack;

class DStack {

    int capacity = 0;
    private int data[] = new int[capacity];
    int top = 0;

    public void push(int a) {
        if (top == capacity) {
            System.out.println("Size was " + capacity + " but we increase capacity by 1");
            expand();
        }
        System.out.println("push");
        data[top] = a;
        top++;
    }

    private void expand() {
        capacity += 1;
        int newData[] = new int[capacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public void pop() {
        if (data.length == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Pop");
            top--;
            shrink();
        }
    }

    private void shrink() {
        capacity -= 1;
        int newData[] = new int[capacity];
        System.arraycopy(data, 0, newData, 0, data.length - 1);
        data = newData;
    }

    public void showData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("Size" + data.length);
    }
}

public class Stack {

    public static void main(String[] args) {
        DStack stack = new DStack();
        stack.pop();
        stack.push(0);
        stack.showData();
         stack.pop();
        stack.showData();
        stack.push(1);
        stack.showData();
        stack.push(2);
        stack.showData();
        stack.pop();
        stack.showData();
        stack.push(56);
        stack.showData();
    }

}
