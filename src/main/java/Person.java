public class Person {
    private String name;
    private int age;
    private String address;
    // this() // also refers contructor call
    // When you are referencing contructor using this() , it has be first statement
    // you reference constructor from constructor only
    public Person(String name, int age, String address) {
        this(name,age);
        this.address = address;
    }

    public Person(String name){
        this.name = name.trim();
    }

    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    public Person(){

    }

    public void printDetails(boolean full){
        if(full){
            this.printDetails();
            System.out.println("Age = "+ age);
            System.out.println("Address = "+ address);

        }else {
            this.printDetails();
        }
    }

    public void printDetails(){
        System.out.println("Name of Person " + name);
    }


    public static void main(String[] args) {
        Person p1 = new Person("Akash",2 );
        p1.printDetails(true);
    }
}
