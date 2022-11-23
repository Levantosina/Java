import javax.xml.soap.Node;
import java.util.*;

public class comparator {

    public static void main(String[] args) {
        List<String> animls = new ArrayList<>();

        animls.add("dog");
        animls.add("cat");
        animls.add("frog");
        animls.add("a");
        animls.add("bird");
        animls.add("dasdasdasdad");

        Collections.sort(animls);
        System.out.println(animls);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(100);
        numbers.add(18);
        numbers.add(41);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else
                    return 0;
            }
        });
        System.out.println(numbers);


        List<Personka> people = new ArrayList<>();
        people.add(new Personka(3,"Bob"));
        people.add(new Personka(1,"katy"));
        people.add(new Personka(2,"Hock"));

        Collections.sort(people, new Comparator<Personka>() {

            @Override
            public int compare(Personka o1, Personka o2) {
                if(o1.getId()>o2.getId())
                {
                    return 1;
                } else if (o1.getId()<o2.getId()) {
                    return -1;

                }
                else {
                    return 0;
                }
            }
        });
        System.out.println(people);
    }
}
class  Personka{
    private  int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Personka(int id, String name) {
        this.id = id;
        this.name = name;
    }
}