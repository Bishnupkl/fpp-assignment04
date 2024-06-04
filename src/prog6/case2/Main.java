package prog6.case2;

import prog6.AnimalType;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet ("Mikey", AnimalType.OMNIVORES, "Alex");
        Pet pet2 = new Pet ("Mikey", AnimalType.OMNIVORES, "Alex");
        Animal ani1 = new Animal ("Mikey", AnimalType.CARNIVORES);
        Animal ani2 = new Animal ("Mikey",AnimalType.CARNIVORES);
        System.out.println(ani1.equals(ani2));
    }
}
