import java.sql.SQLOutput;

public class Dog extends Animals {

    private int numberOfKnowCommands;

    public Dog(String type, String name, int age, int numberOfKnowCommands) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.numberOfKnowCommands = numberOfKnowCommands;
    }

    public Dog() {
        type = "dворняга";
    }

    public int getNumberOfKnowCommands() {
        return numberOfKnowCommands;
    }

    public void setNumberOfKnowCommands(int numberOfKnowCommands) {
        this.numberOfKnowCommands = numberOfKnowCommands;
    }


    @Override
    void born() {
        System.out.println("я собачка я родилась");
    }
}
