/**
 * implement method setAge without 'this' keyword
 * 'this' keyword represent the current object
 */
class Calculator{    
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age, Calculator obj) {
        Calculator obj1 = obj;
        obj1.age = age;
    }
}
class Hello{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.setAge(11, obj);

        System.out.println(obj.getAge());
    }
}