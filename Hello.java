/**
 * try to set alarm you want to wakeup
 * based on string value in day
 */
class Hello{
    public static void main(String[] args){
        String day = "Sunday";
        String result = "";

        result = switch(day){
            case "Saturday", "Sunday" -> "8am";
            case "Friday" -> "11am";
            default -> "5am";
        };

        System.out.println(result);
    }
}