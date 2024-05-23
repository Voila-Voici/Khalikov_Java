// Задание № 2
// Задача № 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число a:");
        int a = sc.nextInt();
        System.out.println("Введите целое число b, кроме 0:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сумма a и b = " + (a + b));
        System.out.println("Разность a и b = " + (a - b));
        System.out.println("Деление a и b = " + (a / b));
        System.out.println("Умножение a и b = " + (a * b));
    }
}