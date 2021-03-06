public class Program {
    private String name;
    private String desc;
    private ProgramTypeEnum programType;
    private double cost;

    public Program(String name) {
        if(name.length()<6){
           throw new RuntimeException("Name should be at-least 6 chars");
        }
        this.name = name;
        this.programType = ProgramTypeEnum.FULLTIME;
    }

    public Program(String name, String desc) {
        this(name);
        this.desc = desc;
    }

    public Program(String name, String desc, ProgramTypeEnum programType) {
        this(name,desc);
        this.programType = programType;
    }

    public Program(String name, String desc, ProgramTypeEnum type, double cost) {
        this(name,desc,type);
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", type=" + programType +
                ", cost=" + cost +
                '}';
    }

    public static void main(String[] args) {
        Program p1 = new Program("LEARNING JAVA","Learning Java", ProgramTypeEnum.PARTTIME, 4000);
        System.out.println(p1);
    }
}
enum ProgramTypeEnum {
    FULLTIME, PARTTIME
}
