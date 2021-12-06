public class ForExample {
    public static void main(String[] args){

        System.out.print("Perulangan 1 : ");
        for (var x = 2.5; x < 100.0; x *= 2){
            System.out.print(x+ " ");
        }

        System.out.println();

        int nums[] = {1,2,3,4,5,6,7,8,9};
        System.out.print("Perulangan 2 : ");
        for (var y : nums){
            System.out.print(y+ " ");
        }

        System.out.println();
    }
}
