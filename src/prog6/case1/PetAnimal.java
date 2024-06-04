package prog6.case1;

import prog6.AnimalType;

public class PetAnimal extends Animal {
    private String owner_name;

    PetAnimal(String name, AnimalType type, String owner_name) {
        super(name, type);
        this.owner_name = owner_name;

    }

    public String getOwner_name() {
        return owner_name;
    }
}
