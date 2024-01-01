/**
 * record overview
 */

//removing this entire class with record
/*
class Calculator{
    int id;
    String name;
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Calculator [id=" + id + ", name=" + name + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Calculator(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
*/
//removing this entire class with record

record Calculator(int id, String name){}

class Hello{
    public static void main(String[] args){
        Calculator obj1 = new Calculator(1, "Navin");
        Calculator obj2 = new Calculator(1, "Navin");
        
        System.out.println(obj1);        
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.name());
    }   
}