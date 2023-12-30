/**
 * static keyword overview
 */
class Calculator{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void show1(Calculator obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}
class Hello{
    public static void main(String[] args){
        Calculator obj1 = new Calculator();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Calculator.name = "Smartphone";

        Calculator obj2 = new Calculator();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // obj2.name = "Smartphone";

        Calculator.name = "phone";

        obj1.show();
        obj2.show();

        Calculator.show1(obj1);
    }
}