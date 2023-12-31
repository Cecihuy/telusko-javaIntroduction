/**
 * inner class overview
 */
class Calculator{
    int age;

    public void show(){
        System.out.println("in show...");
    }    
    static class Computer{
        String name;

        public void config() {
            System.out.println("in config...");
        }
    }
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.show();

        Calculator.Computer obj1 = new Calculator.Computer();
        obj1.config();
    }
}