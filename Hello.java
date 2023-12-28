/**
 * full range of byte is 256. if conversion is larger than range,
 * it will perform modulo(%) by 256
 */
class Hello{
    public static void main(String[] args){        
        int a = 259;
        byte b = (byte) a;  //will perform mod 256

        System.out.println(b);
    }
}