public class Calculator {
    public int addition(int a, int b){  // addition(int, int)
        return a+b;
    }
    public double addition(double a, double b){  // addition(double, double)
        return a+b;
    }

    public int addition(int a, int b, int c){ // addition(int, int,int)
        return this.addition(a,b)+c;
    }

    public int addition(int ...a){
       int sum =0;
        for(int temp: a){
            sum = sum+temp;
        }
        return sum;
    }

    public double addition(int a, double b){
        return a+b;
    }


    public static void main(String[] args) {

        // method overloading // static binding
        Calculator cal = new Calculator();
        System.out.println(cal.addition(10, 15));

        cal.addition(1,2.0);
        cal.addition(1.0,12);
    }
}
