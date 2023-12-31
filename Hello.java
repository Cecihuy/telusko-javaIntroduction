/**
 * lambda expression overview
 */
@FunctionalInterface
interface Calculator{
    int add(int i, int j);
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = (i, j) -> i + j;
        int result = obj.add(5,4);
        System.out.println(result);
    }
}