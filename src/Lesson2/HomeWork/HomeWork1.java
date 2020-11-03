package Lesson2.HomeWork;

public class HomeWork1 {
    public static void main(String[] args) {
        for (int i= 10; i<=30; i++){
            if (i !=21 && i !=22 && i !=23 && i !=24){// или такой вариант if (i<20 || i >25)
                // это || означает или
                System.out.println(i);
            }
        }
    }
}
