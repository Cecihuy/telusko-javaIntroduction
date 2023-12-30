/**
 * upcasting and downcasting overview
 */
class Calculator{
    public void show1(){
        System.out.println("in show 1");
    }
}
class Computer extends Calculator{
    public void show2(){
        System.out.println("in show 2");
    }
}
class Hello{
    public static void main(String[] args) {
        //implicit type casting can work without mention (Calculator)
        //upcasting
        Calculator obj = (Calculator) new Computer();
        obj.show1();

        //downcasting
        Computer obj1 = (Computer) obj;
        obj1.show2();

        
    }
}