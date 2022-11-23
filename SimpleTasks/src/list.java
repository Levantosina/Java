import java.util.List;

public class list {
    public static void main(String[] args) {
        list list=new list();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);
        list.remove(3);
       // list.remove(3);
        System.out.println(list);

    }

    private static Node head;
    private Node previous;
private class Node{

    public Node next;
    public int value;

    public  Node(int value){
        this.value=value;

    }

    }

   public void add(int value) {
       Node currentNode = head;
       Node newNode = new Node(value);

       if (head == null) {
           head = newNode;
       } else {
           while (currentNode.next != null) {
               currentNode = currentNode.next;
           }
           currentNode.next = newNode;
       }
   }

   public void remove(int value) {
       Node currentNode = head;


       while (currentNode!= null) {
           if (currentNode.value == value) {
               if (currentNode == head) {
                   head = currentNode.next;
               } else {
                   previous.next = currentNode.next;
               }
           }
           previous = currentNode;
           currentNode= currentNode.next;
       }
   }

  public String toString(){
    Node currentNode=head;
    String str="[";
    while (currentNode!=null){
        str+=currentNode.value+" ";
    currentNode=currentNode.next;}
    return str+"]";
  }


}