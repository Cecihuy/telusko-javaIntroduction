/**
 * abstract and anonymous inner class overview
 */
abstract class Calculator{
    public abstract void show();
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Calculator(){
            public void show(){
                System.out.println("in new show...");
            }
        };
        obj.show();
    }
}