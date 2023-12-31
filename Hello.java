/**
 * exception handling overview
 */
class Calculator{
    public void show() throws ClassNotFoundException{
        Class.forName("Hello");
    }
}
class Hello{
    static{
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}