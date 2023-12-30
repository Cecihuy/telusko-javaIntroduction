/**
 * equals toString hashcode overview
 */
class Calculator{
    String model;
    int price;

    @Override
    public String toString() {
        return "Calculator [model=" + model + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Calculator other = (Calculator) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }    
}
class Hello{
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        Calculator obj2 = new Calculator();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);

        System.out.println(obj1);
        System.out.println(result);
    }
}