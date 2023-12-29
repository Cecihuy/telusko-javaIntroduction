/**
 * try to print "Hi" 4 times and
 * each "Hi" print "Hello" 2 times
 */
class Hello{
    public static void main(String[] args){
        for(int i = 0; i < 4; i++){
            System.out.println("Hi");
            for(int j = 0; j < 2; j++){
                System.out.println("Hello");
            }
        }            
    }
}