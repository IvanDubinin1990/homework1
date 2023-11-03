package Lesson1_2;

public class Main {

    public static void main(String[] args) {
        printZvedochka(23);
        System.out.println("****    Визитка    ****");
        System.out.println("****   Имя: Иван   ****");
        System.out.println("****  Skype: Ivan  ****");
        printZvedochka(23);
    }

    static void printZvedochka(int x) {
        for (int i = 1; i <= x; i++) {
            if (i < x) {
                System.out.print("*");
            } else {
                System.out.println("*");
            }
        }
    }
}
