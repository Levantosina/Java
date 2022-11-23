public class fighters {
    public static void main(String[] args) {


        System.out.println(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));

    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {


        Fighter f1 = fighter1;
        Fighter f2 = fighter2;


        if (firstAttacker.equals(fighter2.name)) {
            f1=fighter2;
            f2=fighter1;
        }


        while (true){
    if((f2.health-=f1.damagePerAttack) <=0)
        return f1.name;
    if ((f1.health -=f2.damagePerAttack)<=0)
        return f2.name;

            }
        }
    }

//        int health2 = 0;
//        int health1 = 0;
//String winner;
//
//
//
//
//        if (firstAttacker.contains(fighter1.name)) {
//
//            health2 = fighter2.health - fighter1.damagePerAttack;
//            health1 = fighter1.health - fighter2.damagePerAttack;
//            while (health2 > 0 & health1 > 0) {
//
//
//                System.out.println(fighter1.name + " attacks " + fighter2.name + ". " + fighter2.name + " now has " + health2 + " health");
//                System.out.println(fighter2.name + " attacks " + fighter1.name + ". " + fighter1.name + " now has " + health1 + " health");
//
//                health2 = health2 - fighter1.damagePerAttack;
//                health1 = health1 - fighter2.damagePerAttack;
//
//            }
//            System.out.println(fighter1.name + " attacks " + fighter2.name+ ": " + fighter2.name + " now has " + health2 + " health and is dead." + fighter1.name + " wins.");
//
//
//
//
//        } else if (firstAttacker.contains(fighter2.name)) {
//
//
//            health1 = fighter1.health - fighter2.damagePerAttack;
//            health2 = fighter2.health - fighter1.damagePerAttack;
//
//            while (health2 > 0 && health1 > 0) {
//
//                System.out.println(fighter2.name + " attacks " + fighter1.name + ". " + fighter1.name + " now has " + health1 + " health");
//                health1 = health1 - fighter2.damagePerAttack;
//                System.out.println(fighter1.name + " attacks " + fighter2.name + ". " + fighter2.name + " now has " + health2 + " health");
//
//
//                health2 = health2 - fighter1.damagePerAttack;
//
//            }
//
//            System.out.println(fighter2.name + " attacks " + fighter1.name + ": " + fighter1.name + " now has " + health1 + " health and is dead." + fighter2.name + " wins.");
//        }
//
//        if(health1<=0) {
//            winner=fighter2.name;
//            return new Fighter(fighter1.name, fighter2.health, fighter2.damagePerAttack);
//        }
//
//        else {
//            winner=fighter2.name;
//            return new Fighter(winner);
//        }
//    }




     class Fighter {
         public String name;
         public int health, damagePerAttack;

         public Fighter(String name) {
             this.name = name;
         }

         public Fighter(String name, int health, int damagePerAttack) {
             this.name = name;
             this.health = health;
             this.damagePerAttack = damagePerAttack;
         }
     }

  //      @Override
//        public String toString() {
//            return "Fighter{" +
//                    "name='" + name + '\'' +
//                    ", health=" + health +
//                    ", damagePerAttack=" + damagePerAttack +
//                    '}';
//        }
//
//        public String getName() {
//            return name;
//        }
//
//
//
//        public int getHealth() {
//            return health;
//        }
//
//
//
//        public int getDamagePerAttack() {
//            return damagePerAttack;
//        }
//
//
//
//
//    }

