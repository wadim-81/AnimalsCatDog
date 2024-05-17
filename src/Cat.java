import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Random;

public class  Cat extends Animals {
    private int livesWasted;

    private static final int MAX_LIVE = 9;


    public Cat(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }


    public void die() {
        livesWasted++;
        System.out.println("кошка умерла");
    }

    //геттеры = специальные методы, которые позволяют получить доступ к просмотру какого-либо поля
    public boolean jump() {
        if (livesWasted == MAX_LIVE) {
            System.out.println("Извините, но кошка больше не может прыгать");
        }
        Random random = new Random();
        int number = random.nextInt(0, 100);

        if (number == 0) {
            die();
        } else {
            System.out.println("Вау, как круто летим");
        }
        return true;
    }


    @Override
    void born() {
        System.out.println("я кошечка");
    }
}
