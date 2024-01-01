/**
 * Thread overview
 * just only add 'synchronized' to prevent other thread
 * executing method at same time
 */
class Calculator{
    int count;
    public synchronized void increment(){
        count++;
    }
}
class Hello{
    public static void main(String[] args) throws InterruptedException{
        Calculator calc = new Calculator();
        Runnable obj1 = () -> {
            for(int i = 0; i < 10000; i++){
                calc.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0; i < 10000; i++){
                calc.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(calc.count);
    }
}