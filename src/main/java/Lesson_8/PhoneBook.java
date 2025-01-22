package Lesson_8;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;
    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> numbers = phoneBook.get(surname);
        if (numbers == null) {
            numbers = new ArrayList<>();
            phoneBook.put(surname, numbers);
        }
        numbers.add(phoneNumber);
    }

    public List<String> get(String surname) {
        List<String> numbers = phoneBook.get(surname);
        if (numbers == null) {
            return new ArrayList<>();
        }
        return numbers;
    }
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Суворова", "+79261234567");
        phoneBook.add("Васильев", "+79267654321");
        phoneBook.add("Константинов", "+79251234567");
        phoneBook.add("Петров", "+79257654321");
        phoneBook.add("Федоров", "+79161234567");
        phoneBook.add("Федоров", "+79167654321");
        System.out.println("Телефонный Справочник:\nВасильев: " + phoneBook.get("Васильев"));
        System.out.println("Константинов: " + phoneBook.get("Константинов"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Суворова: " + phoneBook.get("Суворова"));
        System.out.println("Федоров: " + phoneBook.get("Федоров"));
    }
}