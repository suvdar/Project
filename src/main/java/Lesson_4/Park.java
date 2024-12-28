package Lesson_4;

public class Park {
    private String name;
    private String address;

    public Park(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + attractionName);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Сокольники", "Москва, Сокольнический вал, д.1");
        Attraction autodrome = park.new Attraction("Автодром", "10:00 - 20:00", 400.0);
        Attraction rollerCoaster = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500.0);
        Attraction aircraft = park.new Attraction("Самолеты", "10:00 - 19:00", 450.0);
        Attraction shootingGallery = park.new Attraction("Тир", "10:00 - 21:00", 250.0);

        autodrome.printInfo();
        rollerCoaster.printInfo();
        aircraft.printInfo();
        shootingGallery.printInfo();
    }
}
