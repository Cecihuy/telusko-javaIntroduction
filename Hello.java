import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * hashset overview
 */
class Hello{
    public static void main(String[] args) throws InterruptedException{
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println("iterator");
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
            System.out.println(values.next());

        System.out.println("for loop");
        for(Integer n:nums){
            System.out.println(n);
        }
    }
}