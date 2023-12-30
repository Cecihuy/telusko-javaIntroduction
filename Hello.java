/**
 * dynamic method dispatch overview
 */
class Calculator{
    public void show(){       
        System.out.println("in Calculator show");
    }
}
class Computer extends Calculator{
    public void show(){       
        System.out.println("in Computer show");
    }
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.show();

        obj = new Computer();
        obj.show();
    }
}