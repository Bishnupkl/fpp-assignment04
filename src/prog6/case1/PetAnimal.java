package prog6.case1;

public class PetAnimal  extends  Animal{
    private String owner_name;

    PetAnimal(String name, String type,String owner_name) {
        super(name, type);
        this.owner_name = owner_name;

    }


}
