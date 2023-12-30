/**
 * constructor overview
 */
class Calculator{    
    private int age;
    private String name;

    public Calculator(){
        age = 30;
        name = "Reddy";
    }
    public Calculator(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator(50, "Java");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        
        // obj.setAge(11);
        // obj.setName("Navin");

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}