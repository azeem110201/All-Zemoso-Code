package singly_linked_list;

public class SList<T> {
    Node<T> head;
    SList(){
        this.head = null;
    }

    public SListIterator<T> iterator(){
        return new SListIterator<>(head);
    }

    public void setHead(Node<T> head){
        this.head = head;
    }

    public String toString(Node<T> head){
        this.head = head;
        if(this.head == null){
            return "Singly Linked List is empty";
        }

        SListIterator<T> iterator = this.iterator();
        StringBuilder outputList = new StringBuilder();
        while(iterator.hasNext()){
            outputList.append(iterator.head.data+ "-->");
            iterator.next();
        }
        outputList.append(iterator.head.data);
        return outputList.toString();
    }
}
