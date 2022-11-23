public class Test {
    public static void main(String[] args) {
        myLinkedList2 myLinkedList=new myLinkedList2();

        myLinkedList.add(1);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(10);


        System.out.println(myLinkedList);
        myLinkedList.remove(3);
        System.out.println(myLinkedList);

    }
}
