package singly_linked_list;

public class Node<T> {
    T data;
    Node next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
    Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
    public String toString(){
        if(this.data == null){
            return null;
        }

        return this.data.toString();
    }
}
