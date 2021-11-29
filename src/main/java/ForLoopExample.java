public class ForLoopExample {
    public static void main(String[] args){

        // PERULANGAN
        for (var i = 0; i <= 20; i++){
            System.out.println("Perulangan ke - " +i);
        }

        // MEMBUAT VARIABLE X DAN Y
        int x, y;
        y = 20;

        // VARIABLE Y, MENGIKUTI X, KARENA VARIABLE X BELUM TERPENUHI
        for (x = 0; x <= 100; x++){
             System.out.println("Nilai x : " +x);
             System.out.println("Nilai y : " +y);
             y -= 2;
         }
    }
}
