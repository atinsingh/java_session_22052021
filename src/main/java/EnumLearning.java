public class EnumLearning {
    public static void main(String[] args) {
        int a = 2093830;
        String name =  "asssaakdjdyjdsd";
        ShapeEnum atinEnum = ShapeEnum.RECTANGLE;
        sum(1828);

        sumEnum(ShapeEnum.SQUARE);
    }

    public static void sum(int a){
        System.out.println(a);
    }

    public static void sumEnum(ShapeEnum a){
        System.out.println(a);
    }
}
enum ShapeEnum {
    CIRCLE, SQUARE,RECTANGLE
}
