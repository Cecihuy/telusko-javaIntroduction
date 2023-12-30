/**
 * static keyword overview
 */
class Calculator{
    String brand;
    int price;
    static String name;

    public Calculator(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
    static{
        name = "Phone";
        System.out.println("in static block");
    }
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
class Hello{
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("Calculator");
        // Calculator obj1 = new Calculator();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Calculator.name = "Smartphone";

        // Calculator obj2 = new Calculator();
    }
}