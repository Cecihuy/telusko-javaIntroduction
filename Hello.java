/**
 * method overriding overview
 */
class Calculator{
    public int add(int n1, int n2){       
        return n1 + n2;
    }
}
class Computer extends Calculator{
    public int add(int n1, int n2){       
        return n1 + n2 + 4;
    }
}
class Hello{
    public static void main(String[] args) {
        Computer obj = new Computer();
        int r1 = obj.add(4, 5);

        System.out.println(r1);
    }
}