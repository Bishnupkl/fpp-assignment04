package prog6.case2;


import prog6.AnimalType;

public class PetAnimal extends Animal {

    private String ownerName;

    public PetAnimal(String name, AnimalType animalType, String ownerName) {
        super(name, animalType);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String owner_name) {
        this.ownerName = owner_name;
    }

    @Override
    public boolean equals(Object withPet) {
        if (!super.equals(withPet)) return false;
        PetAnimal p = (PetAnimal) withPet;
        if(this.ownerName.equals(p.ownerName)) return true;
        return false;
    }
}