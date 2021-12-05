public class ForLoopExample2 {
    public static void main(String[] args){

        int n;
        for (n = 0; n < 20; n++)
            System.out.println("Perulangan ke - " +n);


        ///
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Jumlah = " +sum); // JUMLAH = 45
    }
}
