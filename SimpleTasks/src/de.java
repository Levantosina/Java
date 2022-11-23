import java.util.Arrays;

public class de {


   // public de(){
    //    head=null;
//    }

private Node head;
      private class Node{
          public int value;

          public Node(int value) {
              this.value = value;
          }

          public Node next;

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
              currentNode.next=newNode;
           }
       }

       public void remove(int value){
          Node currennode=head;
          Node previous=null;
          while (currennode.next!=null)
          {
              if(currennode.value==value){
                  if(currennode==head){
                      head=currennode.next;
                  }
                  else {
                      previous.next=currennode.next;
                  }
              }
              previous=currennode;
              currennode=currennode.next;
          }
       }
       public String toString(){
          Node currentNode=head;
          String toArray="["+currentNode.value;
          while (currentNode!=null){
              toArray+=","+currentNode.value;
              currentNode=currentNode.next;
          }
              return toArray+"]";
       }


    public static void main(String[] args) {

            de list=new de();

            list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);


        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }

}

