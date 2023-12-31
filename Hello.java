/**
 * interface overview
 */
interface Calculator{
    void show();
    void config();
}
interface Laptop{
    void run();
}
class Computer implements Calculator, Laptop{
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
    public void run() {
        System.out.println("in run");
    }    
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Computer();
        obj.show();
        obj.config();

        Laptop obj1 = new Computer();
        obj1.run();
    }
}