import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * taking input from user overview
 */
class Hello{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();
    }
}