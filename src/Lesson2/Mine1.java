package Lesson2;

public class Mine1 {
    public static void main(String[] args) {
        byte a = 10;
        int c = a;// автоматическое преобразование
        int bidNumber = 12000;
        byte d = (byte)bidNumber; // программное (приведение) преобразовние
        System.out.println(d);
    }

    public static class Mine2{
        public static void main(String[] args) { // домашнее задание
            for (int i = 100; i >=90; i--)
                System.out.println(i);
        }


    }
}
