public class Employee {
    private String name;
    private int empId;
    private double salary;
    private String dept;

    public Employee(String name, int empId, double salary, String dept) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if( salary > 60000){
            System.out.println("NOT A GOOD IDEA");
            return;
        }
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
