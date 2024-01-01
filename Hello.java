/**
 * Thread overview
 */
class Calculator implements Runnable{
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
class Computer implements Runnable{
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
        Runnable obj1 = new Calculator();
        Runnable obj2 = new Computer();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}