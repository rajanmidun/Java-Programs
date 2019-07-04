package queue;

class DQueue {
   int front, rear,capacity,index = 0;
    private int queue[] = new int[capacity];
   
    public void enqueue(int a) {
            if (rear == capacity) {
                System.out.println("Queue size was " + capacity + " so, we increase size by 1");
                expand();
            }
            System.out.println("Enqueue "+a);
            queue[rear] = a;
            rear=rear+1;
        
    }

    public void expand() {
        capacity += 1;
        int newQueue[] = new int[capacity];
        System.arraycopy(queue, 0, newQueue, 0, queue.length);
        queue = newQueue;
    }

    public void dequeue() {
        if (rear <= front) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeue "+queue[front]);
            front += 1;
            shrink();
        }
    }

    private void shrink() {
        capacity -= 1;
        int newQueue[] = new int[capacity];
        System.arraycopy(queue, front, newQueue, 0, queue.length - 1);
        front--;
        rear--;
        queue = newQueue;
    }

    public void showData() {
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.print("Front "+front+" Rear "+rear);
        System.out.println(" Queue_size " + queue.length);
    }
}

public class Queue {

    public static void main(String[] args) {
        DQueue dqueue = new DQueue();
        dqueue.dequeue();
         
        dqueue.enqueue(0);
        dqueue.showData();
        
       dqueue.dequeue();
       dqueue.dequeue();
       dqueue.showData();

        dqueue.enqueue(1);
        dqueue.showData();
        
        dqueue.enqueue(2);
        dqueue.showData();
        
       dqueue.dequeue();
       dqueue.showData(); 

       dqueue.dequeue();
       dqueue.showData();
    }
}
