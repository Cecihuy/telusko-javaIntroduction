import java.util.HashMap;
import java.util.Map;

/**
 * hashmap overview
 */
class Hello{
    public static void main(String[] args) throws InterruptedException{
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Navin", 56);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 92);
        students.put("Harsh", 45);

        System.out.println(students.get("Sushil"));

        System.out.println(students.keySet());

        for(String name:students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }

    }
}