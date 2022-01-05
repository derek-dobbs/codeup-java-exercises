public class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public String sayHello(){
//TODO: print a message to the console using the person's name
//        return String.format("Hello from %s!", name);
        return String.format("Hello from %s!", name);
    }

    public static void main(String[] args) {
        Person derek = new Person();
        derek.name = "Derek";
//        derek.setName("Steve");
        System.out.println(derek.sayHello());
    }// end main
}//end class
