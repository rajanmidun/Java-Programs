package linklist.algorithm;

class LinkedList {

    Node head;
    int count = 0;

    public void insert(int a) {
        Node node = new Node();
        node.data = a;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node list = head;
            while (list.next != null) {
                list = list.next;
            }
            list.next = node;

        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            head = node;
            node.next = n;
        }
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;

        if (index == 0) {
            if (head == null) {
                node.next = null;
            } else {
                Node n = head;
                head = node;
                node.next = n;
            }
        } else {

            Node n = head;
            while (n.next != null) {
                if (count == index - 1) {
                    Node temp = n.next;
                    n.next = node;
                    node.next = temp;
                }
                count++;
                n = n.next;
            }
        }
    }

    public void deleteAt(int index) {
        Node n = head;
        Node temp = null;
        if (head == null) {
            System.out.println("Data is not available!!");
        } else {
            if (index == 0) {
                head = n.next;
            } else {
                 for(int i=0;i<index-1;i++){
                     n=n.next;                 
                 }
                 temp=n.next;
                 n.next=temp.next;
                 temp=null;
            }
        }
    }

    public void showData() {
        Node n = head;
        if (n == null) {
            System.out.println("No data!!");
        } else {
            while (n.next != null) {
                System.out.print(n.data + "-");
                System.out.println(n.next);
                n = n.next;
            }
            System.out.print(n.data + "-");
            System.out.println(n.next);
        }
    }
}

public class LinkListAlgorithm {

    public static void main(String[] args) {
        LinkedList linknode = new LinkedList();
        linknode.insert(34);
        linknode.insert(23);
        linknode.insert(34);
        linknode.insertAtStart(236);
        linknode.insertAt(3, 54);
        linknode.deleteAt(2);
        linknode.showData();
    }

}
