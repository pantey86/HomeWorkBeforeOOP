package ua.forartcode;

import java.util.Scanner;

public class ExtendedUtils {

//5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

    public static void changeFrom10To2Code () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое будет выведено в двоичной кодировке");
        int a = sc.nextInt();

        String code2 = "";

        while (a != 0){
            int tail = a%2;
            a/=2;
            code2 = tail+code2;
        }

        System.out.println("Двоичный код числа - "+code2);

        sc.close();

    }

    public static void changeFrom2To10Code () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код числа в двоичной кодировке");
        String s = sc.nextLine();
        int number = 0;

        String reversed = "";// reversed string s
        int j = s.length()-1;

        for (int i=0;i<s.length();i++){
            reversed = reversed + s.charAt(j);
            j--;
        }

        for (int i=0;i<reversed.length();i++){
            int temp = Character.getNumericValue(reversed.charAt(i));
            number =number +(int) Math.pow(2,i)*temp;
        }
        System.out.println("Десятичный код числа - "+number);

        sc.close();

    }


//5.2. Вычислить факториал числа.

    public static void factorial () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int a = sc.nextInt();
        int f = 1;

        if (a == 0)
            f=1;
        else
            for (int i =1 ; i <= a ; i++){
            f=f*i;
            }
        System.out.println("Factorial of number " + a + " is "+ f);

        sc.close();

    }

//5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
//			5678  -   1
//          5889  -   2
//          8888  -   4
//          989990  - 1

    public static void count8 () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count 8's ");
        int a = sc.nextInt();
        int counter8 = 0;

        String s = a+"";

        for (int i = 0; i<s.length();i++){
           if(s.charAt(i)== '8')
               counter8++;
           else
               continue;
        }

        System.out.println("Amount of 8's in your number is "+ counter8);

        sc.close();

    }

}
