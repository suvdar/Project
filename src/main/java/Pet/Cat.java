package Pet;

public class Cat extends Animal {
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