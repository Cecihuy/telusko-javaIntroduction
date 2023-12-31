/**
 * exception handling overview
 */
class Hello{
    public static void main(String[] args) {
        int i = 2;
        int j = 0;        
        int[] k = new int[5];
        String l = null;

        try{
            j = 18/i;
            System.out.println(l.length());
            System.out.println(k[2]);
            System.out.println(k[5]);
        } 
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit");
        }
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}