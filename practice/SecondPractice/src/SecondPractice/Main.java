package SecondPractice;
import SecondPractice.Witcher;
import SecondPractice.Warrior;
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
