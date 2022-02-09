package singly_linked_list;

public class SListIterator<T> {
    Node head;
    SListIterator(Node head){
        this.head = head;
    }

    // adding to linked list
    public Node<T> insertIntoSList(T data){
        Node<T> temp = new Node<>(data);
        temp.data = data;

        //if the node is empty, it then creates a new node and assign to head
        if(this.head == null){
            this.head = temp;
            return this.head;
        }

        // append the node to the end of the linked list while traversing to the end of the list using next pointer

        Node<T> current = this.head;

        while (current.next != null){
            current = current.next;
        }

        current.next = temp;
        temp = current;

        return this.head;
    }

    //remove node from the last
    public Node<T> removeFromLast(){
        // if the head is null then retun null
        if(this.head == null){
            return null;
        }

        //else traverse all the node-1 and remove the last node.
        Node<T> current = this.head;
        Node<T> previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;

        return this.head;
    }

    public boolean hasNext(){
        return this.head.next != null;
    }

    public Node next(){
        this.head = this.head.next;
        return this.head;
    }
}
