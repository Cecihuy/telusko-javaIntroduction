import java.util.Arrays;
import java.util.List;

/**
 * stream overview
 * try to filter even number,
 * then multiply 2, then add all
 */
class Hello{
    public static void main(String[] args) throws InterruptedException{
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        
        nums.forEach(n -> System.out.println(n));

        int sum = 0;
        for(int n: nums){
            if(n % 2 == 0){
                n = n * 2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
    }
}