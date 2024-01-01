/**
 * Thread overview
 */
class Calculator extends Thread{
    @Override
    public void run(){
        for(int i = 1; i < 10; i++){
            System.out.println("hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
        }
    }
}
class Computer extends Thread{
    @Override
    public void run(){
        for(int i = 1; i < 10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
        }
    }
}
class Hello{
    public static void main(String[] args){
        Calculator obj1 = new Calculator();
        Computer obj2 = new Computer();
        
        // System.out.println(obj1.getPriority());
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());

        obj1.start();
        try {
                Thread.sleep(100);
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
        obj2.start();
        try {
                Thread.sleep(100);
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
    }
}