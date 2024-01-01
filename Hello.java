/**
 * Thread overview
 */
class Calculator extends Thread{
    @Override
    public void run(){
        for(int i = 1; i < 10; i++){
            System.out.println("hi");
        }
    }
}
class Computer extends Thread{
    @Override
    public void run(){
        for(int i = 1; i < 10; i++){
            System.out.println("hello");
        }
    }
}
class Hello{
    public static void main(String[] args){
        Calculator obj1 = new Calculator();
        Computer obj2 = new Computer();

        obj1.start();
        obj2.start();
    }
}