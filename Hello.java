/**
 * anonymous inner class overview
 */
class Calculator{
    public void show(){
        System.out.println("in show...");
    }
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