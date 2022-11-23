import javax.xml.soap.Node;
import java.util.Arrays;

public class myLinkedList2 {

    private static class Node{
        private int value;
        private Node next;

        private void setValue(int value){
            this.value=value;
        }
        private void setNext(Node next){
            this.next=next;
        }
        private int getValue(){
            return value;
        }
        private Node getNext(){
            return next;
        }

        public  Node(int value){
            this.value=value;
        }

    }
    private Node head;
    private int size;


    public void add(int value){
        Node temp=head;

        if(head==null) {
            this.head = new Node(value);
        }

        else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }

        size++;

    }

    public void remove(int index){
        Node temp=head;
        int ind=0;
        if(index==0) {
            head = head.getNext();
            size--;
            return;
        }
        while (temp!=null) {
            if (ind==index-1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }
            else {
                temp=temp.getNext();
                ind++;
            }
        }
    }

    public String toString(){
        Node temp=head;
        int [] result=new int[size];
        int indx=0;

        while (temp!=null) {
            result[indx++] = temp.getValue();
            temp=temp.getNext();
        }

        return Arrays.toString(result);

    }

}
