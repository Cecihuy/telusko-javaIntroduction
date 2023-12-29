/**
 * sample array overview
 */
class Hello{
    public static void main(String[] args){
        int nums[] = {5,7,2};        
        System.out.println(nums[1]);

        nums[1] = 6;    //to change element
        System.out.println(nums[1]);

        int number[] = new int[4];
        number[0] = 4;
        number[1] = 8;
        number[2] = 3;
        number[3] = 9;
        System.out.println(number[1]);

        for(int i = 0; i < 4; i++){
            System.out.print(number[i] + " ");
        }
    }
}