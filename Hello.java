/**
 * sample array of object overview
 */
class Calculator{
    int rollNo;
    String name;
    int marks;
}
class Hello{
    public static void main(String[] args){
        Calculator calc1 = new Calculator();
        calc1.rollNo = 1;
        calc1.name = "Navin";
        calc1.marks = 88;

        Calculator calc2 = new Calculator();
        calc2.rollNo = 2;
        calc2.name = "Harsh";
        calc2.marks = 67;

        Calculator calc3 = new Calculator();
        calc3.rollNo = 3;
        calc3.name = "Kiran";
        calc3.marks = 97;
        
        Calculator calcs[] = new Calculator[3];
        calcs[0] = calc1;
        calcs[1] = calc2;
        calcs[2] = calc3;
        
        for(Calculator calcul:calcs){
            System.out.println(calcul.name + " : " + calcul.marks);
        }
    }
}