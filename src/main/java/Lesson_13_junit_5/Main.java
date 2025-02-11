package Lesson_13_junit_5;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + "!=" + Factorial.get(i));
        }
    }
}
