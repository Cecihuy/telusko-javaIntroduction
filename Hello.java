/**
 * post and pre increment result will be different in fetch perform
 */
class Hello{
    public static void main(String[] args){        
        int num = 7;
        int result = 0;
/* uncomment one of these statement */
//        result = num++;     //fetch the value and then increment. result=7
//        result = ++num;     //increment and then fetch the value. result=8

        System.out.println(result);
    }
}