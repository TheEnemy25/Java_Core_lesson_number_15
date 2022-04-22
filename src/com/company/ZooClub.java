package com.company;

import java.util.*;

public class ZooClub {

    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        zooClub.menuMain();
    }

    Map<Person, List<Pet>> map = new LinkedHashMap<>();

    public void menuMain() {

        while (true) {
            Menu menu = new Menu();
            menu.menu();

            Scanner scanner = new Scanner(System.in);

            switch (scanner.next()) {
                case "1": {
                    System.out.println("Введіть імя учасника:");
                    String name = scanner.next();
                    System.out.println("Введіть вік учасника:");
                    int age = scanner.nextInt();
                    if (map.containsKey(new Person(name, age))) {
                        System.out.println("Такий учасник вже існує");
                    } else {
                        map.put(new Person(name, age), new ArrayList<>());
                    }
                    break;
                }
                case "2": {
                    System.out.println("Введіть імя учасника:");
                    String name = scanner.next();
                    System.out.println("Введіть вік учасника:");
                    int age = scanner.nextInt();
                    Person person = new Person(name, age);
                    if (map.containsKey(person)) {
                        System.out.println("Введіть імя тваринки:");
                        String namePet = scanner.next();
                        System.out.println("Введіть вид тваринки:");
                        String kindOfAnimal = scanner.next();
                        map.get(person).add(new Pet(namePet, kindOfAnimal));
                    } else {
                        System.out.println("Такого учасника не існує");
                    }
                    break;
                }
                case "3": {
                    System.out.println("Введіть імя учасника:");
                    String name = scanner.next();
                    System.out.println("Введіть вік учасника:");
                    int age = scanner.nextInt();
                    Person person = new Person(name, age);
                    if (map.containsKey(person)) {
                        System.out.println("Введіть імя тваринки:");
                        String namePet = scanner.next();
                        System.out.println("Введіть вид тваринки:");
                        String kindOfAnimal = scanner.next();
                        Pet pet = new Pet(namePet, kindOfAnimal);
                        map.get(person).remove(map.get(person).indexOf(pet));
                    } else {
                        System.out.println("Питомец не найден!");
                    }
                    break;
                }
                case "4": {
                    System.out.println("Введіть імя учасника:");
                    String name = scanner.next();
                    System.out.println("Введіть вік учасника:");
                    int age = scanner.nextInt();

                    Person person = new Person(name, age);
                    if (map.containsKey(person)) {
                        map.remove(person);
                    } else {
                        System.out.println("Учасника не знайдено");
                    }
                    break;
                }
                case "5": {
                    System.out.println("Введіть вид тваринки:");
                    String kindOfAnimal = scanner.next();
                    Set<Person> keySet = map.keySet();
                    for (Person keys : keySet) {
                        ListIterator<Pet> iter = map.get(keys).listIterator();
                        while (iter.hasNext()) {
                            Pet pet = (Pet) iter.next();
                            if (pet.getKindOfAnimal().equals(kindOfAnimal)) {
                                iter.remove();
                            }
                        }
                    }
                    break;
                }
                case "6": {
                    Set<Person> keySet = map.keySet();
                    for (Person keys : keySet) {
                        for (Pet pet : map.get(keys)) {
                            System.out.println(keys + " " + pet);
                        }
                        if (map.get(keys).isEmpty()) {
                            System.out.println(keys);
                        }
                    }
                    if (map.isEmpty()) {
                        System.out.println("Учасників не знайдено");
                    }
                    break;
                }
                case "7": {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}