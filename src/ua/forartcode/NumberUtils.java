package ua.forartcode;

import java.util.Scanner;

public class NumberUtils {

    //	4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
//	Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

    public static void workOrRest() {
        System.out.println("Enter current time (from 0 to 24)");
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        if (time >= 9 && time <= 18) {
            System.out.println("I'm at my workplace");
        } else if (time <= 0 && time < 9 || time > 18 && time <= 24) {
            System.out.println("I'm relaxing!!!");
        } else {
            System.out.println("You've entered wrong time. It should be between 0 and 24");
            workOrRest();
        }
        sc.close();
    }

    //	4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
    public static void maxAndMinOf3() {
        double min, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter third number: ");
        double c = sc.nextDouble();
        if (a >= b && a >= c)
            max = a;
        else if (b >= a && b >= c)
            max = b;
        else
            max = c;

        if (a <= b && a <= c)
            min = a;
        else if (b <= a && b <= c)
            min = b;
        else
            min = c;

        System.out.println("Max value = " + max + "\nMin value = " + min);
        sc.close();

    }

    //	4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
    public static void canBeDividedBy7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double a = sc.nextDouble();

        if (a % 7 == 0)
            System.out.println("Your number can be devided by 7. Its double value = " + a * 2);
        else
            System.out.println("Your number cann't be devided by 7");
        sc.close();
    }

    //	4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
    public static void isNumberBetween0and1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double a = sc.nextDouble();
        if (a >= 0 && a <= 1)
            System.out.println("Your number is between 0 and 1");
        else
            System.out.println("Your number is NOT between 0 and 1");
        sc.close();

    }

    //	4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
    public static void sumOrMinus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        double result;
        if (a > b) {
            result = a - b;
            System.out.println("First number is bigger!Difference is " + result);
        } else if (a < b) {
            result = a + b;
            System.out.println("Second number is bigger!Sum is " + result);
        } else {
            result = a;
            System.out.println("Your numbers are equals! Its value is " + result);
        }
        sc.close();
    }

    //	4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
    public static void isSumBetween11and19() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        double sum = a + b;
        if (sum > 10 && sum < 20)
            System.out.println("The sum of your numbers is between 11 and 19. Sum is " + sum);
        else
            System.out.println("The sum of your numbers is NOT between 11 and 19. Sum is "+sum);
        sc.close();
    }
    //	4.7. Вводим два числа, если одно из них делиться на другое без остатка,
//	    то выводим тру и показываем результат деления (целую часть от деления  и остачу)
//	    в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
    public static void canDivideEachOther () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int res;
        int tail;
        if (a % b == 0) {
            res = a / b;
            System.out.println("true. a/b = " + res);
        } else if (b % a == 0) {
            res = b / a;
            System.out.println("true. b/a = " + res);
        } else if (a > b && a % b != 0) {
            res = a / b;
            tail = a % b;
            System.out.println("false. a/b = " + res + " and tail is " + tail);
        } else if (b > a && b % a != 0) {
            res = b / a;
            tail = b % a;
            System.out.println("false. b/a = " + res + " and tail is " + tail);
        }
        sc.close();
    }


    //	4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
//			124    4    -   true
//			1456   567  -   false
//			1      2    -   false
//			18     98   -   true
    public static void compareOfLastDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        if (a % 10 == b % 10) {
            System.out.println(a + "\t" + b + "\t" + "true");
        } else
            System.out.println(a + "\t" + b + "\t" + "false");
        sc.close();
    }
}
