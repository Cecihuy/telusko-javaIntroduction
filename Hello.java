import java.util.Scanner;
/**
 * taking input from user overview
 */
class Hello{
    public static void main(String[] args){
        System.out.println("Enter a number");        

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
    }
}