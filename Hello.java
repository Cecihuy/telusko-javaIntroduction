/**
 * interface overview
 */
abstract class Computer{
    public abstract void code();
}
class Desktop extends Computer{
    public void code(){
        System.out.println("get desktop...");
    }
}
class Laptop extends Computer{
    public void code(){
        System.out.println("get laptop...");
    }
}
class Developer{
    public void devApp(Computer computer){
        computer.code();
    }
}
class Hello{
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();

        Developer navin = new Developer();
        navin.devApp(laptop);
    }
}