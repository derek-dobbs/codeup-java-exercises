package warmups;

//January 6, 2022
//Warmup
//Create a class named “warmups.Penguin”
public class Penguin {
    //Give your class the following private fields
    //Name
    private String name;
    //Weight
    private short weight;
    //Species
    private String species;
    //Sex
    private String sex;

    //Give your class the following public methods
    //getName
    public String getName() {
        return name;
    }
    //getWeight
    public short getWeight() {
        return weight;
    }
    //getSpecies
    public String getSpecies() {
        return species;
    }
    //getSex
    public String getSex() {
        return sex;
    }
    //setName
    public void setName(String newName) {
        this.name = newName;
    }
    //setWeight
    public void setWeight(short newWeight) {
        this.weight = newWeight;
    }
    //setSpecies
    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }
    //setSex
    public void setSex(String newSex) {
        this.sex = newSex;
    }
    //Give your class a constructor method
    public Penguin() {

    }

    public Penguin(String name, short weight, String species, String sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    //Give your class the following public static methods
    //canFly (returns false)
    public static boolean canFly() {
        return false;
    }
    //areEvil (returns true)
    public static boolean areEvil() {
        return true;
    }

    public static void main(String[] args) {
        Penguin derek = new Penguin("Derek", (short) 200, "Human", "Male");
//        derek.setName("Derek");
//        derek.setWeight((short) 200);
//        derek.setSex("Male");
//        derek.setSpecies("Human");

        System.out.printf("Penguin Info:%n Name: %s%n Weight: %d%n Species: %s%n Sex: %s%n", derek.name, derek.weight, derek.species, derek.sex);
    }//end psvm
}// end class warmups.Penguin