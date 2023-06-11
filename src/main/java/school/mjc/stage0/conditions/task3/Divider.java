package school.mjc.stage0.conditions.task3;

public class Divider {

    public static void printString(String str) {
        System.out.println(str);
    }
    public void isDividableBy5And11(int number) {
        if (number == 0) {
            printString("cannot divide by zero");
        } else if (number % 5 == 0 && number % 11 == 0) {
            printString("Dividable");
        }
    }
}
