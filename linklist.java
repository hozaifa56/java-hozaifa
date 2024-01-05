public class linklist {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.print("list is empty");
        }
        head = head.next;
        return;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.print("list is empty");
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        return;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        linklist list = new linklist();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addFirst("this");
        list.addLast("linked list");
        list.printList();
        list.deleteLast();
        list.printList();
    }

}
