/**
 * 'this' and 'super' keyword overview
 * try to print below in sequence
 * in Calculator with int n
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
        System.out.println("in Computer");
    }
    public Computer(int n){
        super(6);
        System.out.println("in Computer with int n");
    }
}
class Hello{
    public static void main(String[] args) {
        Computer obj = new Computer(5);
    }
}