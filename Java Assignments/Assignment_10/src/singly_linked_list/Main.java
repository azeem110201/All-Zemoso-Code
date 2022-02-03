package singly_linked_list;

public class Main {
    public static void main(String[] args) {

        // creating linked list of type string
        SList<String> stringList = new SList<>();
        SListIterator<String> iterator = stringList.iterator();
        iterator.head = iterator.insertIntoSList("hi");
        iterator.head = iterator.insertIntoSList("how");
        iterator.head = iterator.insertIntoSList("are");
        iterator.head = iterator.insertIntoSList("you");;
        System.out.println(stringList.toString(iterator.head));
        iterator.head = iterator.removeFromLast();
        System.out.println(stringList.toString(iterator.head));


        // creating linked list of type int
        SList<Integer> intList = new SList<>();
        SListIterator<Integer> intIterator = intList.iterator();
        intIterator.head = intIterator.insertIntoSList(10);
        intIterator.head = intIterator.insertIntoSList(20);
        intIterator.head = intIterator.insertIntoSList(30);
        intIterator.head = intIterator.insertIntoSList(40);
        intIterator.head = intIterator.insertIntoSList(50);
        System.out.println(intList.toString(intIterator.head));
        intIterator.head = intIterator.removeFromLast();
        System.out.println(intList.toString(intIterator.head));


    }
}
