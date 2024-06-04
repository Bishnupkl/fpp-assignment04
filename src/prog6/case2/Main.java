package prog6.case2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet ("Mikey", AnimalType.Omnivore, "Alex");
        Pet pet2 = new Pet ("Mikey", AnimalType.Omnivore, "Alex");
        Animal ani1 = new Animal ("Mikey", AnimalType.Carnivore);
        Animal ani2 = new Animal ("Mikey",AnimalType.Carnivore);
        System.out.println(ani1.equals(ani2));
    }
}
