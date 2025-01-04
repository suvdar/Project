package Pet;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Тузик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Рыжик");
        Cat cat2 = new Cat("Снежок");
        Cat cat3 = new Cat("Пушок");

        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего животных: " + Animal.getAnimalCount());

        dog1.run(300);
        dog1.swim(5);
        dog2.run(600);
        dog2.swim(15);
        cat1.run(150);
        cat1.swim(1);
        cat2.run(200);
        cat2.swim(5);
        cat3.run(250);
        cat3.swim(10);

        Bowl bowl = new Bowl(20);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");

        bowl.addFood(15);
        System.out.println("Добавили еды. Теперь в миске: " + bowl.getFood() + " ед.");

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
                System.out.println(cat.getName() + " сыт: " + cat.isFull());
            }
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");
    }
}
