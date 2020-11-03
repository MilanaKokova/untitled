package Lesson11;

public class Pingvin implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("aaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Пингвин прыгает");

    }

    @Override
    public void run() {
        System.out.println("пингвин бегает");

    }
}
