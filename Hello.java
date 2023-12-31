/**
 * lambda expression overview
 */
@FunctionalInterface
interface Calculator{
    void show();
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = () -> System.out.println("in show");
        obj.show();
    }
}