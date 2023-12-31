/**
 * functional interface overview
 */
@FunctionalInterface
interface Calculator{
    void show();
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Calculator()           
        {
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
}