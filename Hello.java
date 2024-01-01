import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * comparator overview
 * try to sort ascending base on age
 */
class Calculator{
    int age;
    String name;
    
    public Calculator(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Calculator [age=" + age + ", name=" + name + "]";
    }
}
class Hello{
    public static void main(String[] args) throws InterruptedException{
        List<Calculator> nums = new ArrayList<Calculator>();
        nums.add(new Calculator(21, "Navin"));
        nums.add(new Calculator(12, "John"));
        nums.add(new Calculator(18, "Parul"));
        nums.add(new Calculator(20, "Kiran"));

        Comparator<Calculator> com = new Comparator<Calculator>() {
            public int compare(Calculator i, Calculator j){
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(nums, com);

        for(Calculator calc:nums)
            System.out.println(calc);
    }
}