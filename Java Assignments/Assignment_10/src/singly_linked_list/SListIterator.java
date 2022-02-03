package singly_linked_list;

public class SListIterator<T> {
    Node head;
    SListIterator(Node head){
        this.head = head;
    }

    public Node<T> insertIntoSList(T data){
        Node<T> temp = new Node<>(data);
        temp.data = data;

        if(this.head == null){
            this.head = temp;
            return this.head;
        }

        Node<T> current = this.head;

        while (current.next != null){
            current = current.next;
        }

        current.next = temp;
        temp = current;

        return this.head;
    }
    public Node<T> removeFromLast(){
        if(this.head == null){
            return null;
        }
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
