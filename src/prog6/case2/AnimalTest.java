package prog6.case2;

import prog6.AnimalType;

public class AnimalTest {
    public static void main(String[] args) {
        PetAnimal pet1 = new PetAnimal("Mikey", AnimalType.OMNIVORES, "Alex");
        PetAnimal pet2 = new PetAnimal("Mike", AnimalType.OMNIVORES, "Alex");
        Animal ani1 = new Animal ("Mikey", AnimalType.CARNIVORES);
        Animal ani2 = new Animal ("Mikey",AnimalType.CARNIVORES);

        System.out.println(ani1.equals(ani2));
        System.out.println(pet2.equals(pet2));
        System.out.println(pet1.equals(pet2));
    }
}
