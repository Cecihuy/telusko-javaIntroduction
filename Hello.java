/**
 * enum overview
 */
enum Laptop{
    MACBOOK(2000), XPS(2200), SURFACE, THINKPAD(1800);
    
    private int price;

    private Laptop(){
        price = 500;
    }
    private Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
class Hello{
    public static void main(String[] args) {
        Laptop laptop = Laptop.MACBOOK;
        System.out.println(laptop + " : " + laptop.getPrice());

        for(Laptop efl:Laptop.values()){
            System.out.println(efl + " : " + efl.getPrice());
        }
    }
}