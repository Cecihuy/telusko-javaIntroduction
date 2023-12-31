/**
 * lambda expression overview
 */
@FunctionalInterface
interface Calculator{
    void show(int i);
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = i -> System.out.println("in show " + i);
        obj.show(5);
    }
}