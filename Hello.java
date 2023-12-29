/**
 * try to print 10 if value of n is even
 * or print 9 if value of n is odd
 */
class Hello{
    public static void main(String[] args){
        int n = 5;
        int result = 0;
       
        result = n % 2 == 0 ? 10 : 9;
        
        System.out.println(result);
    }
}