/**
 * sample method overview
 */
class Calculator{    
    public void playMusic(){
        System.out.println("Music Playing...");
    }
    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

class Hello{
    public static void main(String[] args){
        Calculator obj = new Calculator();
        obj.playMusic();
        String str = obj.getMeAPen(10);

        System.out.println(str);
    }
}