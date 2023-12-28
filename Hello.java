/**
 * byte out of range result will be promote into higher type (int)
 */
class Hello{
    public static void main(String[] args){        
        byte a = 10;
        byte b = 30;
        int result = a * b;     //result is 300 which is byte can't hold

        System.out.println(result);
    }
}