/**
 * try to print "Hi" 4 times and
 * each "Hi" print "Hello" 2 times
 */
class Hello{
    public static void main(String[] args){
        int n = 1;
        while(n <= 4){
            System.out.println("Hi");
            int m = 1;
            while(m <= 2){
                System.out.println("Hello");
                m++;
            }
            n++;
        }
    }
}