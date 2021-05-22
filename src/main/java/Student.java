public class Student {
    public static String className="Java FullStack";
    public String nameOfStudent;

    public Student(String nameOfStudent){
        this.nameOfStudent = nameOfStudent;
    }

    public static void sayHelloFromStatic(){
        System.out.println("You are in "+  className);

    }

    public void sayHelloFromObject(){
        System.out.println("Hello" + this.nameOfStudent);
        System.out.println("You are in "+  className);
        sayHelloFromStatic();
    }

    public void doSomeThing(){
        System.out.println("THIS iS DOSOMEHITN");
    }
}
