import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HatsAndBalls {
    private HashMap<Integer,Integer> hats=new HashMap<Integer,Integer>();
    public HatsAndBalls(){

    }
    public  void addBall(int x) {
        if (hats.containsKey(x)) {
            hats.put(x, hats.get(x) + 1);
        } else {
            hats.put(x, 1);
        }
    }
    public int howManyHasOne(){
        return hats.size();
    }
    public int greatestAmount(){
        int max=0;
        for(Map.Entry<Integer,Integer>entry:hats.entrySet()){
            if(entry.getValue()>max)
                max=entry.getValue();
        }
        return max;
    }

    public static void main(String[] args) {
        HatsAndBalls hat =new HatsAndBalls();
        Random random=new Random();
        for(Integer i=0;i<5;i++){
            hat.addBall(random.nextInt(10));
        }
        System.out.println("How many hats has atleast one ball:" + hat.howManyHasOne());
        System.out.println("And the greatest in one is: " + hat.greatestAmount());
    }
}
