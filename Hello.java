/**
 * int to byte (large to smaller type) conversion is not allowed
 */
class Hello{
    public static void main(String[] args){        
        int a = 12;
        byte b = (byte) a;  //explicit type convertion needed

        System.out.println(b);
    }
}