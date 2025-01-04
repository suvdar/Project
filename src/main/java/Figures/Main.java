package Figures;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Белый", "Черный");
        Shape rectangle = new Rectangle(4, 7, "Красный", "Синий");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Зеленый");

        System.out.println("Круг:");
        circle.printCharacteristics();

        System.out.println("\nПрямоугольник:");
        rectangle.printCharacteristics();

        System.out.println("\nТреугольник:");
        triangle.printCharacteristics();
    }
}
