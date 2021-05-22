public class Shirt {
    private ShirtSize size;
    private ColorEnum shirtColor;
    private double price;

    public Shirt(ShirtSize size, ColorEnum shirtColor, double price) {
        this.size = size;
        this.shirtColor = shirtColor;
        this.price = price;
    }

    public void printShirtDetails(){
        System.out.println("Shirt Details");
        System.out.println("Size : " + size);
        System.out.println("Color : " + shirtColor);
        System.out.println("Price : " + price);
    }
}
