public class DimensionalArray {
    public static void main(String[] args){

        // AVERAGE AN ARRAY OF VALUES
        // DIMENSIONAL ARRAY ADALAH HANYA SATU []
        int arrayInt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (var saveArray : arrayInt){
            System.out.println("Value : " +saveArray);
        }

        System.out.println("===========================================");

        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;

        for (i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Average is " + result / 5);
    }
}
