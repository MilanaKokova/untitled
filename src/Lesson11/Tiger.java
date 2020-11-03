package Lesson11;

public class Tiger implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("ррррррр");
    }

    @Override
    public void jump() {
        System.out.println("тигр прыгает");

    }

    @Override
    public void run() {
        System.out.println("тигр бегает");

    }
}

