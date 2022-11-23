import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class queue {
    public static void main(String[] args) {
        Person1 person1=new Person1(1);
        Person1 person2=new Person1(2);
        Person1 person3=new Person1(3);
        Person1 person4=new Person1(4);

        Queue<Person1> people=new ArrayBlockingQueue<>(3);
        System.out.println( people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println( people.offer(person4));
        System.out.println(people.offer(person1));


    }
}

class  Person1 {
    private int id;
    public Person1(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }


}