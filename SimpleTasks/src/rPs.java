public class rPs {

    public static String rps(String p1, String p2) {
        final String rock = "rock";
        final String paper = "paper";
        final String scissors = "scissors";

        String result = "";


        if (p1.equals(p2)) {
            result ="Draw!";
            System.out.println(result);

        } else {
            switch (p1) {

//rock case
                case rock:
                    if (p2 == paper)
                        result = ("Player 2 won!");


                   else
                        result = ("Player 1 won!");
                    System.out.println(result);
                    break;

//paper case
                case paper:
                    if (p2 == scissors)
                        result = ("Player 2 won!");
                    else
                        result = ("Player 1 won!");
                    System.out.println(result);
                    break;
// scissors case
                case scissors:
                    if (p2 == rock)
                        result = ("Player 2 won!");
                    else
                        result = ("Player 1 won!");
                    System.out.println(result);
                    break;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Fixed Tests Player 1 won!");
        rps("rock", "scissors");
        rps("scissors", "paper");
        rps("paper", "rock");

        System.out.println("Fixed Tests Player 2 won!");
        rps("scissors", "rock");
        rps("paper", "scissors");
        rps("rock", "paper");

        System.out.println("Fixed Tests Draw!");
        rps("scissors", "scissors");
        rps("paper", "paper");
        rps("rock", "rock");
    }
}
