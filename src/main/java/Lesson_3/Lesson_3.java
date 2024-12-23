package Lesson_3;

public class Lesson_3 {
    public static void main (String [] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        System.out.println(sumBetween10And20(8, 4));
        System.out.println(sumBetween10And20(-5, 5));
        System.out.println(sumBetween10And20(15, 2));

        isPositiveOrNegative(-5);
        isPositiveOrNegative(0);
        isPositiveOrNegative(4);

        System.out.println(isNegativOrPositive(-3));
        System.out.println(isNegativOrPositive(0));
        System.out.println(isNegativOrPositive(1));

        printLineAndNumber("Спасибо за проверку!", 3);

        System.out.println(leapYear(2024));

        int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] multiplyBy2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        replacingElementsInAnArray(replaceValues);
        System.out.println();
        fillingAnArray(100);
        System.out.println();
        numbersLessThan6MultiplyBy2(multiplyBy2);
        System.out.println();
        fillInTheElements1();
        returnSingleDimensionalArray(2, 3);


    }

    // Задание 1//
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // Задание 2//
    public static void checkSumSign() {
        int a = -5;
        int b = -1;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3//
    public static void printColor() {
        int value = 100;
        if (value <=0) {
            System.out.println("Красный");
        } if (value>0 && value<=100) {
            System.out.println("Желтый");
        } if (value>100) {
            System.out.println("Зеленый");
        }
    }

    // Задание 4//
    public static void compareNumbers() {
        int a = 64;
        int b = 65;
        if  (a>=b) {
            System.out.println("a>=b");
        } if (a<b) {
            System.out.println("a<b");
        }
    }

    // Задание 5//
    static boolean sumBetween10And20(int a, int b) {
        return a + b >=10 && a + b <=20;
    }

    // Задание 6//
    static void isPositiveOrNegative(int i) {
        System.out.println(i >= 0 ? "Положительое" : "Отрицательное");
    }

    // Задание 7//
    static boolean isNegativOrPositive(int i) {
        return i < 0;
    }

    // Задание 8//
    static void printLineAndNumber(String line, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(line);
    }

    // Задание 9//
    static boolean leapYear(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }

    // Задание 10//
    public static void replacingElementsInAnArray(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0)? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
    }

    // Задание 11//
    public static void fillingAnArray(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }

    // Задание 12//
    public static void numbersLessThan6MultiplyBy2(int[] multiplyBy2) {
        for (int i = 0; i < multiplyBy2.length; i++) {
            if (multiplyBy2[i] < 6) {
                multiplyBy2[i] = multiplyBy2[i] * 2;
            }
            System.out.print(multiplyBy2[i] + " ");
        }
    }

    // Задание 13//
    public static void fillInTheElements1() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // Задание 14//
    public static void returnSingleDimensionalArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

}