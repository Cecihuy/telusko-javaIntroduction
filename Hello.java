import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * for each overview
 * you may lambda it on Consumer
 */
class Hello{
    public static void main(String[] args) throws InterruptedException{
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);        
        
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }            
        };

        nums.forEach(con);        
    }
}