public class TestRun {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Akash",1, 50000, "IT");
        emp1.setSalary(75000);
        System.out.println("Employee " + emp1.getName() + " has salary "+ emp1.getSalary());
    }
}
