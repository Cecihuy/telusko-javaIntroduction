/**
 * interface overview
 */
interface Calculator{
    int age = 30;           //final and static
    String area = "Mumbai"; //final and static

    void show();            //public abstract
    void config();          //public abstract
}
class Computer implements Calculator{
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }    
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Computer();
        obj.show();
        obj.config();

        System.out.println(Calculator.age);
        System.out.println(Calculator.area);
    }
}