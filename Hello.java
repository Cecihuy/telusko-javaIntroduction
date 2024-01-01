import java.util.ArrayList;
import java.util.List;

/**
 * arraylist overview
 */
class Hello{
    public static void main(String[] args) throws InterruptedException{
        List<Integer> nums =new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.get(2));

        System.out.println(nums.indexOf(5));

        System.out.println("forLoop");
        for(Integer n:nums){
            System.out.println(n);
        }
    }
}