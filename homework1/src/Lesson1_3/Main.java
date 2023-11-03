package Lesson1_3;

public class Main {

    public static void main(String[] args) {
        printZvedochka(23);
        System.out.print("****    Визитка    ****\n****   Имя: Иван   ****\n**** Skype: \"Ivan\" ****\n");
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


