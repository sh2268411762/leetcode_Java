package 单链表;

public class TestDemo
{
    public static void main(String[] args)
    {
        LinkedListDemo myLinkedList = new LinkedListDemo();
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);

        myLinkedList.display();
        myLinkedList.addLast(7);
        myLinkedList.addLast(8);
        myLinkedList.addLast(100);
        myLinkedList.display();

        myLinkedList.addIndex(5,6);
        myLinkedList.addIndex(8,9);
        myLinkedList.display();


        myLinkedList.remove(9);
        myLinkedList.remove(1);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(100));
        System.out.println(myLinkedList.contains(123));
        myLinkedList.display();

        myLinkedList.reverseList();
        myLinkedList.display();

//        myLinkedList.addLast(77777);
//        myLinkedList.addLast(77777);
//        myLinkedList.addLast(77777);
//        myLinkedList.addLast(77777);
//        myLinkedList.addLast(77777);
//        myLinkedList.display();
//        myLinkedList.removeAllKey(77777);
//        myLinkedList.display();
//        myLinkedList.removeAllKey(7);
//        myLinkedList.display();
//        myLinkedList.removeAllKey(2);
//        myLinkedList.display();

//        System.out.println(myLinkedList.head.next);
//        System.out.println(myLinkedList.head);
//        System.out.println(myLinkedList.searchPrevKey(2));
//        System.out.println(myLinkedList.searchPrevKey(3));
//        System.out.println(myLinkedList.searchPrevKey(4));
//        System.out.println(myLinkedList.searchPrevKey(9));
//
//        System.out.println("\n" + myLinkedList.contains(3));
//        System.out.println(myLinkedList.contains(6));
//        System.out.println(myLinkedList.contains(100));

    }
}
