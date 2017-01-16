package ua.forartcode;

import java.util.Scanner;

public class AdditionalUtils {

//1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
//    лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
//
    public static void isTriangle (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter second side of triangle: ");
        double b = sc.nextDouble();
        System.out.println("Enter third side of triangle: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a * a + b * b == c * c || c * c + b * b == a * a || a * a + c * c == b * b)
                System.out.println("Your triangle is right-angled ");
            else
                System.out.println("Your triangle is NOT right-angled ");
        } else
            System.out.println("You CANNOT create a triangle with such sides");

        sc.close();

    }

//2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
//    тельные заменить на 0.
//
    public static void posTripleNegTo0 () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter third number: ");
        double c = sc.nextDouble();

        double a1 = a > 0 ? Math.pow(a, 3) : 0;
        double b1 = b > 0 ? Math.pow(b, 3) : 0;
        double c1 = c > 0 ? Math.pow(c, 3) : 0;

        System.out.println("was\t\t" + a + "\t\tbecame\t\t"+ a1+
                           "\nwas\t\t" + b + "\t\tbecame\t\t"+ b1+
                           "\nwas\t\t" + c + "\t\tbecame\t\t"+ c1);

        sc.close();
    }

// 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
//   одинаковые; б) есть ли среди его цифр одинаковые.
//
    public static void threeDigitNumber () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three-digit number");
        int numb = sc.nextInt();

        if(numb/100 >=1 && numb / 1000 < 1) {
            int a = numb / 100;
            int b = (numb / 10) % 10;
            int c = numb % 10;

            System.out.println("first digit of your number is " + a +
                    "\nsecond digit of your number is " + b +
                    "\nthird digit of your number is " + c);

            if (a==b && a==c)
                System.out.println("All digits are equal");
            else if (a==b && a!=c)
                System.out.println("Only first and second digits are equal");
            else if (a==c && a!=b)
                System.out.println("Only first and third digits are equal");
            else if (b==c && b!=a)
                System.out.println("Only second and third digits are equal");
            else
                System.out.println("There are no any equal digits");

        }else threeDigitNumber();
    }

// 4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
//   ду. Какая из них больше?
//
    public static void compareOfSpeed () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed (km/h)");
        double a = sc.nextDouble();
        System.out.println("Enter another speed (m/s)");
        double b = sc.nextDouble();

        System.out.println("first speed (km/h)- "+a+ "\t(m/s)- " +(a*1000/3600)+
                           "\nsecond speed (km/h)- "+(b*3600/1000)+ "\t(m/s)- " +(b) );

        if ((a*1000/3600) > b)
            System.out.println("First speed is BIGGER");
        else if ((a*1000/3600) < b)
            System.out.println("Second speed is BIGGER");
        else
            System.out.println("Both speeds are equal");

        sc.close();

    }

// 5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
//   пара равных
//
    public static void compareOfThreeNumbers () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter third number: ");
        double c = sc.nextDouble();

        System.out.println("a = " + a +
                         "\nb = " + b +
                         "\nc = " + c);

        if (a == b && a == c)
            System.out.println("Three numbers are equal");
        else if (a == b)
            System.out.println("The first and the second numbers are equal");
        else if (a == c)
            System.out.println("The first and the third numbers are equal");
        else if (b == c)
            System.out.println("The second and the third numbers are equal");
        else
            System.out.println("There're NO ANY equal numbers");

        sc.close();

    }

//6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
//
    public static void findTimeToArrive () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your speed (km/h)");
        double speed = sc.nextDouble();
        System.out.println("Enter the distance between two points (km)");
        double distance = sc.nextDouble();

        double time = distance/speed;

        System.out.println("You need " + time + " hours.");

        sc.close();

    }
//7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
//    времени года. Если пользователь введет недопустимое число, программа
//    должна выдать сообщение об ошибке.
//
    public static void showSeason () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month (number from 1 to 12)");
        int a = sc.nextInt();

        if (a>0 && a <=12){
            if (a==1 || a==2 || a==12 )
                System.out.println("You've entered winter month");
            else if (a==3 || a==4 || a==5)
                System.out.println("You've entered sping month");
            else if (a==6 || a==7 || a==8)
                System.out.println("You've entered summer month");
            else
                System.out.println("You've entered autumn month");

        }else{
            System.out.println("You've entered WRONG month number.It should be between 1 and 12 inclusive");
            showSeason();
        }
        sc.close();

    }

//8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
//    тавляется, если сумма покупки превышает 1000 гривен.
//
     public static void calaulateFinalPrice () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money you want to spend");
        double a = sc.nextDouble();

        a = (a>=1000 ? a*0.9 : a);

         System.out.println("Your final price is " + a);

         sc.close();

     }

//9) Написать программу вычисления идеального веса пользователя (рост-
// 100). Выдать рекомендации о необходимости поправиться либо поху-
//    деть.
//
    public static void recomendPerfectWeight () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height (cm) ");
        double a = sc.nextDouble();
        System.out.println("Enter your weight (kg) ");
        double b = sc.nextDouble();

        System.out.println("Your perfect weigth is " + (a-100));

        if((a-100)==b)
            System.out.println("Congratulations! You have perfect weigth");
        else if ((a-100)>b)
            System.out.println("Dear friend, You have to eat more.Your weigth is less than perfect");
        else
            System.out.println("Sorry,but You have to eat less.Your weigth is more than perfect");

        sc.close();

    }
//10) Написать программу вычисления стоимости переговоров, если по суббо-
//    там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
//    ность разговора и день недели (цифра от 1 до 7).
//
    public static void calculateCallPrice () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter call length (minutes)");
        double callLength = sc.nextDouble();
        System.out.println("Enter call price (grn/minute)");
        double minutePtice = sc.nextDouble();
        System.out.println("Enter day of week (number from 1 to 7 inclusive) ");
        int day = sc.nextInt();

        if (day >0 && day <8) {
            if (day>1 && day < 6)
                System.out.println("Your call price is " + callLength*minutePtice);
            else
                System.out.println("Your call price is " + callLength*minutePtice*0.8);

        }else{
            System.out.println("You've entered WRONG day of the week. It sould be a number from 1 to 7 inclusive");
            calculateCallPrice();
        }

        sc.close();

    }
// 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
//    добавляет к нему слово "копейка" в правильной форме. Например, 1
//    копейка, 5 копеек, 42 копейки .

    public static void printMoneyMsg () {

        String s1 = " копейка";
        String s2 = " копейки";
        String s3 = " копеек";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество копеек ");
        int a =sc.nextInt();

        if (a%10 == 1)
            System.out.println("Ваше количество - "+ a + s1);
        else if (a%10 >1 && a%10<5)
            System.out.println("Ваше количество - "+ a + s2);
        else
            System.out.println("Ваше количество - "+ a + s3);

        sc.close();

    }

//12) Написать программу, которая в зависимости от характера ветра выдает
//    сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-9 м/c -
//    умеренный (2); от 10-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
//
    public static void showWindSpeedMsg () {

        String s1 = "слабый ветер";
        String s2 = "умеренный ветер";
        String s3 = "сильный ветер";
        String s4 = "ураганный ветер";
        String s5 = "ветра нет";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скрость ветра (м/с) ");
        double speed =sc.nextDouble();

        if (speed == 0 )
            System.out.println(s5);
        else if (speed >=1 && speed <=4)
            System.out.println(s1);
        else if (speed >= 5 && speed <=9)
            System.out.println(s2);
        else if (speed >= 10 && speed <=18)
            System.out.println(s3);
        else
            System.out.println(s4);

        sc.close();

    }
//13) Даны три числа A,B,C. Увеличить числа в два
//    раза, если A+B+C>0, в противном случае заменить
//    на нули.
//
    public static void threeNumbTransform () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter third number: ");
        double c = sc.nextDouble();

        double a1 = (a+b+c)>0 ? a*2 : 0;
        double b1 = (a+b+c)>0 ? b*2 : 0;
        double c1 = (a+b+c)>0 ? c*2 : 0;

        System.out.println("was\t" + a + "\tbecame\t" + a1+
                         "\nwas\t" + b + "\tbecame\t" + b1+
                         "\nwas\t" + c + "\tbecame\t" + c1);

        sc.close();

    }
// 14) Определить, является ли шестизначное число "счастливым" (сумма
//    первых трех цифр равна сумме последних трех цифр).
//
    public static void isLuckyNumber () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6-digit number");
        int a = sc.nextInt();

        if (a>=100000 && a < 1000000){

            int digit1 = a/100000;
            int digit2 = a/10000%10;
            int digit3 = a/1000%10;
            int digit4 = a/100%10;
            int digit5 = a/10%10;
            int digit6 = a%10;

            int leftSum = digit1 + digit2 + digit3;
            int rightSum = digit4 + digit5 + digit6;

            if (leftSum == rightSum)
                System.out.println("Your number is lucky!!!");
            else
                System.out.println("Your number is NOT lucky");

        }else{
            System.out.println("You've entered NOT 6-digit number. Try to enter it again");
            isLuckyNumber();
        }

        sc.close();

    }
// 15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
//    квадрат; б) уместится ли квадрат в круге.

    public static void compareOfCircleAndSquare () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle area");
        double circleArea = sc.nextDouble();
        System.out.println("Enter square area");
        double squareArea = sc.nextDouble();

        double r = Math.sqrt(circleArea/Math.PI); // circle radius
        double a = Math.sqrt(squareArea); // square side
        double d = Math.sqrt(2*a*a); // square diagonal

        if (r < a/2 )
            System.out.println(" You can put your circle inside square");
        else if (d < 2*r)
            System.out.println("You can put square inside circle");
        else
            System.out.println("Dimensions of your figures are equal");

        sc.close();

    }

}
