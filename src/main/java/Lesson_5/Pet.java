package Lesson_5;

public class Pet {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Тузик");
        Dog dog2 = new Dog("Шарик");

        Cat cat1 = new Cat("Рыжик");
        Cat cat2 = new Cat("Снежок");
        Cat cat3 = new Cat("Пушок");

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

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

abstract class Animal {
    protected String name;
    protected static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFull = true;
            System.out.println(name + " поел и теперь сыт");
        } else {
            System.out.println(name + " не смог поесть. Недостаточно еды в миске");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) {
            System.out.println("Количество еды должно быть больше нуля");
            return false;
        }
        if (food >= amount) {
            food -= amount;
            return true;
        }
        System.out.println("Недостаточно еды в миске. Осталось " + food + " ед.");
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " ед. еды в миску");
        } else {
            System.out.println("Количество добавляемой еды должно быть больше нуля");
        }
    }

    public int getFood() {
        return food;
    }
}
