import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * taking input from user overview
 */
class Hello{
    public static void main(String[] args) throws IOException{
        int num = 0;
        // BufferedReader br = null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        // finally{
        //     br.close();
        // }
    }
}