/**
 * enum overview
 */
enum Calculator{
    RUNNING, FAILED, PENDING, SUCCESS;
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = Calculator.FAILED;

        if(obj == Calculator.RUNNING)
            System.out.println("All good");
        else if(obj == Calculator.FAILED)
            System.out.println("Try again");
        else if(obj == Calculator.PENDING)
            System.out.println("Please wait");
        else
            System.out.println("Done");

        switch(obj){
            case RUNNING:
                System.out.println("All good");
                break;
            case FAILED:
                System.out.println("Try again");
                break;
            case PENDING:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
        }

        switch(obj){
            case RUNNING -> System.out.println("All good");
            case FAILED -> System.out.println("Try again");
            case PENDING -> System.out.println("Please wait");
            default -> System.out.println("Done");
        }
    }
}