import java.util.*;

public class comparable {
    public static void main(String[] args) {

        List<MyPerson> list = new ArrayList<>();
        Set<MyPerson>set= new TreeSet<>();
        addElements(list);
        addElements(set);
        Collections.sort(list);


        System.out.println(list);
        System.out.println(set);

    }
    private static void addElements(Collection collection){

        collection.add(new MyPerson("Blgfgadfas"));
        collection.add(new MyPerson("Blabladads"));
        collection.add(new MyPerson("Kekekec"));
        collection.add(new MyPerson("Bu"));

    }
}

class MyPerson implements Comparable<MyPerson> {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPerson myPerson = (MyPerson) o;
        return name == myPerson.name;
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "id=" + name +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public MyPerson(String name) {
        this.name = name;
        // this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public int compareTo(MyPerson o) {
        if(name.length()> o.getName().length()){
            return 1;
        }
        else if(name.length()< o.getName().length()){
            return -1;
        }
        else {
            return 0;
        }
    }
}



