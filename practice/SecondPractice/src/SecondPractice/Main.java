package SecondPractice;
import java.util.ArrayList;
import java.util.Random;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Warrior[] warrior_arr = {
//                new Warrior("A"),
//                new Warrior("B"),
//                new Warrior("C")
//        };
//
//        Witcher[] witcher_arr = {
//                new Witcher("D"),
//                new Witcher("E"),
//                new Witcher("F")
//        };
//
//        ArrayList<Role> role_arr = new ArrayList<Role>();
//        role_arr.add(new Warrior("A"));
//        role_arr.add(new Warrior("B"));
//        role_arr.add(new Warrior("C"));
//
//        role_arr.add(new Witcher("D"));
//        role_arr.add(new Witcher("E"));
//        role_arr.add(new Witcher("F"));
//
//
//        while (true) {
//
//            Random r = new Random();
//
//            int rand_a = r.nextInt(5+ 1);
//            int rand_b = r.nextInt(5+ 1);
//
//            Role r1 = role_arr.get(rand_a);
//            Role r2 = role_arr.get(rand_b);
//
//            if (r1.getClass() == Warrior.class) {
//                r1.
//            }
//
//            System.out.println(r1.getClass());
//
//            break;
//
//
//
//        }
//
//    }
//
//}


import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Warrior[] warrior_arr = {
                new Warrior("A"),
                new Warrior("B"),
                new Warrior("C")
        };

        Witcher[] witcher_arr = {
                new Witcher("D"),
                new Witcher("E"),
                new Witcher("F")
        };


        while (true) {
            int a = 0, b = 0;

            Random r = new Random();

            a = r.nextInt(2+ 1);
            b = r.nextInt(2+ 1);


            warrior_arr[a].NewMoon(witcher_arr[b]);

            a = r.nextInt(2+ 1);
            b = r.nextInt(2+ 1);


            witcher_arr[a].SmallFire(warrior_arr[b]);

        }

    }

}

