public class BlockScope {
    public static void main(String[] args){
        // Dapat digunakan di main
        int x;

        x = 10;
        if (x == 10){   // START NEW SCOPE
            int y = 20; // HANYA BISA DIGUNAKAN UNTUK BLOK IF
            // VARIABLE X DAN Y DAPAT DIGUNAKAN DALAM BLOK INI
            System.out.println("x and y : " + x + " " + y);
        }

        // ERROR, KARENA VARIABLE Y BERADA DI SCOPE IF
        // y = 100
    }
}
