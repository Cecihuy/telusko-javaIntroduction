/**
 * exception handling overview
 */
class NavinException extends Exception{
    public NavinException(String string) {
        super(string);
    }    
}
class Hello{
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18 / i;
            if(j == 0)
                throw new NavinException("i dont want print zero");
        } 
        catch(NavinException e){
            j = 18/1;
            System.out.println("thats the default output " + e);
        }        
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}