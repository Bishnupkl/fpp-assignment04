package prog6.case3;

import prog6.AnimalType;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animalCarnivores = new Animal("Tiger", AnimalType.CARNIVORES);
        Animal animalHerbivores = new Animal("Panda", AnimalType.HERBIVORES);

        PetAnimal petAnimalCarnivores = new PetAnimal("KHEANG", animalCarnivores);
        PetAnimal petAnimalHerbivores = new PetAnimal("ALEX", animalHerbivores);
        PetAnimal petAnimalOmnivores = new PetAnimal("BISNU", new Animal("Bear", AnimalType.OMNIVORES));
        PetAnimal petAnimalCarnivores2 = petAnimalCarnivores;

        System.out.println("petAnimalCarnivores = null: "+ petAnimalCarnivores.equals(null));
        System.out.println("petAnimalCarnivores = animalCarnivores: " + petAnimalCarnivores.equals(animalCarnivores));
        System.out.println("petAnimalCarnivores = petAnimalHerbivores: " + petAnimalCarnivores.equals(petAnimalHerbivores));
        System.out.println("petAnimalCarnivores = petAnimalOmnivores: " + petAnimalCarnivores.equals(petAnimalOmnivores));
        System.out.println("petAnimalCarnivores = petAnimalCarnivores: " + petAnimalCarnivores.equals(petAnimalCarnivores));
        System.out.println("petAnimalCarnivores = petAnimalCarnivores2: " + petAnimalCarnivores.equals(petAnimalCarnivores2));
    }
}
