package prog6.case2;

import prog6.AnimalType;

public class Animal {
    private String name;
    AnimalType type;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean equals(Object aAnimal) {
        if(aAnimal == null) return false;
        if(aAnimal.getClass() != this.getClass())
            return false;
        Animal p = (Animal)aAnimal;
        boolean isEqual = this.name.equals(p.name) && this.type.equals(p.type);
        return isEqual;
    }
}
