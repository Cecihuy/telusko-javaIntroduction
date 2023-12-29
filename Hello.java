/**
 * try to set alarm you want to wakeup
 * based on string value in day
 */
class Hello{
    public static void main(String[] args){
        String day = "Sunday";

        switch(day){
            case "Saturday", "Sunday" ->
                System.out.println("8am");
            case "Friday" ->
                System.out.println("11am");
            default ->
                System.out.println("5am");
        }        
    }
}