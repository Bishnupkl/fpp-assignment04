package prog6.case2;


public class Pet extends Animal {
    private String owner_name;

    public Pet(String name, AnimalType type, String owner_name) {
        super(name,type);
        this.owner_name = owner_name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    @Override
    public boolean equals(Object withPet) {
        if(withPet == null) return false;
        if(withPet.getClass() != this.getClass())
            return false;
        Pet p = (Pet)withPet;
        boolean isEqual = getOwner_name().equals(p.getOwner_name());
        return isEqual;
    }
}