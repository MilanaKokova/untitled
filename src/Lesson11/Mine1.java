package Lesson11;

public class Mine1 {
    public static void main(String[] args) {
        Pingvin pingvin = new Pingvin();
        Pingvin pingvin1 = new Pingvin();

        Tiger tiger = new Tiger();
        Tiger tiger1 = new Tiger();

        ZooAnimal[] animals = new ZooAnimal[4];
        animals[0] = pingvin;
        animals[1] = tiger;
        animals[2] = pingvin1;
        animals[3] = tiger1;

        for (ZooAnimal animal:animals){
            animal.voice();// проявление полиморфизма Полиморфизм это свойство java которое
            // работать с разными типами данных как с одним и тем же. А выполнение программы
            // будет как будто мы работаем с разными типами.

        }

    }
}
