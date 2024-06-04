package prog6.case3;

class PetAnimal {

    String owerName;
    Animal animal;

    public PetAnimal(String owerName, Animal animal) {
        this.owerName = owerName;
        this.animal = animal;
    }
    public String getOwnerName() {
        return owerName;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void setOwnerName(String owerName) {
        this.owerName = owerName;
    }
    public boolean equals(Object ob) {
        if(ob == null) {
            System.out.print("Object is null ");
            return false;
        }
        if(ob.getClass() != this.getClass()){
            System.out.print("Object is not of type " + this.getClass().getSimpleName()+ " ");
            return false;
        }
        if(this == (PetAnimal)ob) {
            System.out.print("The same Object ");
            return true;
        }
        PetAnimal p = (PetAnimal)ob;
        if( p.animal.getName().equals(this.animal.getName())
                &&
            p.animal.getAnimalType().equals(this.animal.getAnimalType())
                &&
            p.getOwnerName().equals(this.owerName))
        return true;
        else{
            System.out.print("Object status is not the same ");
            return false;
        }
    }
}
