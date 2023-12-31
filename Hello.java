/**
 * abstract keyword overview
 */
abstract class Calculator{
    public abstract void fly();
    public abstract void drive();
    public void playMusic(){
        System.out.println("playing music...");
    }
}
class Computer extends Calculator{
    public void fly() {
        System.out.println("flying...");
    }
    public void drive() {
        System.out.println("driving...");
    }    
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Computer();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}