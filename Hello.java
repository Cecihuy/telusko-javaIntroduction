/**
 * functional interface overview
 */
@FunctionalInterface
interface Calculator{
    void show();
}
class Computer implements Calculator{
    @Override
    public void show() {
        System.out.println("in show");
    }
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Computer();
        obj.show();
    }
}