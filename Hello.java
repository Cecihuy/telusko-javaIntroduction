/**
 * if 'if' condition is true and without block
 * will be execute only one statement after
 */
class Hello{
    public static void main(String[] args){
        if(true)
            System.out.println("Hello");
        System.out.println("Bye");

        if(false)
            System.out.println("Hi");
        System.out.println("Again");

        /*  statement after 'else' keyword only will be 
            execute if 'if' condition is false
        */
        System.out.println("condition if with else");

        if(true)
            System.out.println("Hello");
        else
            System.out.println("Bye");

        if(false)
            System.out.println("Hi");
        else
            System.out.println("Again");
    }
}