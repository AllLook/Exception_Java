import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class work2 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

        // doubleNum();
        // divNumber();
        // emptyLine();
    }

    public static float doubleNum() {
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            float num = iScanner.nextFloat();
            // System.out.print(num);
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Повторите с корректным вводом: ");
            doubleNum();
        }
        return 0;

    }

    public static void divNumber() {
        Integer[] intArray = { 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void emptyLine() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите cообщение: ");
        String message = iScanner.nextLine();
        if (message.equals("")) {
            throw new RuntimeErrorException(null, "Вы не ввели текст сообщения,пустые строки вводить нельзя: ");
        } else {
            System.out.printf("Ваше сообщение %s", message);
        }

    }

}
