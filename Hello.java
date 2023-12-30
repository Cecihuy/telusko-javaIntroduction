/**
 * encapsulation overview
 */
class Calculator{    
    private int age;
    private String name;

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
    public static void main(String[] args){
        Calculator obj = new Calculator();
        obj.setAge(11);
        obj.setName("Navin");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}