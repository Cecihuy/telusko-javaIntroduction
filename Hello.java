/**
 * enum overview
 */
enum Calculator{
    RUNNING, FAILED, PENDING, SUCCESS;
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = Calculator.FAILED;
        System.out.println(obj);
        System.out.println(obj.ordinal());

        Calculator[] obj1 = Calculator.values();
        for(Calculator efl:obj1){
            System.out.println(efl + " : " + efl.ordinal());
        }
    }
}