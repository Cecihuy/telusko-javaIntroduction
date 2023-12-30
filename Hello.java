/**
 * 'this' and 'super' keyword overview
 * try to print below in sequence
 * in Calculator
 * in Computer
 * in Computer with int n
 */
class Calculator extends Object{
    public Calculator(){
        System.out.println("in Calculator");
    }
    public Calculator(int n){       
        System.out.println("in Calculator with int n");
    }   
}
class Computer extends Calculator{
    public Computer(){
        super();    //'super' method execute constuctor in super class(parent)
        System.out.println("in Computer");
    }
    public Computer(int n){
        this();     //'this' method execute constructor in same class
        System.out.println("in Computer with int n");
    }
}
class Hello{
    public static void main(String[] args) {
        Computer obj = new Computer(5);
    }
}