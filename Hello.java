/**
 * sealed class overview
 */
sealed class Calculator extends Thread implements Cloneable permits Computer, Desktop{

}
final class Computer extends Calculator{

}
non-sealed class Desktop extends Calculator{

}
class Developer extends Desktop{

}
sealed interface X permits Y{

}
non-sealed interface Y extends X{

}
class Hello{
    public static void main(String[] args){        
    }   
}