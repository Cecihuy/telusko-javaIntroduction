/**
 * anonymous object use only once
 * we can not reuse anonymous object
 */
class Calculator{
    public Calculator(){
        System.out.println("object creation proved");
    }
    public void show(){       
        System.out.println("in Calculator show method");
    }   
}
class Hello{
    public static void main(String[] args) {
        new Calculator();           //this anonymous object can't be used
        new Calculator().show();    //way to use the anonymous object. but only once
    }
}