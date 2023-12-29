/**
 * multidimentional array instanciate describe like a table.
 * first bracket is rows(number of arrays)
 * second bracket is columns(number of element each arrays)
 */
class Hello{
    public static void main(String[] args){
        int nums[][] = new int[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //inserting random value        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                nums[i][j] = (int)(Math.random()*10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //enhance forLoop
        for(int n[]:nums){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();
        //get specific element
        System.out.println(nums[1][2]);
    }
}