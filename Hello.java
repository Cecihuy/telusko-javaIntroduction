import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * comparator overview
 * try to sort ascending base on last digit
 */
class Hello{
    public static void main(String[] args) throws InterruptedException{
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(nums, com);

        System.out.println(nums);
    }
}