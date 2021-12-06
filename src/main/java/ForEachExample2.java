public class ForEachExample2 {
    public static void main(String[] args){

        int sums[] = {1,2,3,4,5,6,7,8,9,10};
        int val = 6;
        boolean kondisi = false;

        for (int x : sums){
            if (x == val){
                kondisi = true;
            }
        }

        if (kondisi){
            System.out.println("Nilai Ditemukan");
        }
    }
}
