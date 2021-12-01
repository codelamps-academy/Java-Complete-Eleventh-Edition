public class Casting {
    public static void main(String[] args){

        int i = 257;
        double d = 323.142;

        // NILAI BYTE AKAN MENGULANG KARENA NILAI POSTIF BYTE = 256
        System.out.println("\nConversion of int to byte.");
        byte b = (byte) i;
        System.out.println("i dan b = " +i+ " |||| " +b);


        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("int dan double = " +i+ " |||| " +d);

        System.out.println("\nConversion of double to byte");
        b = (byte) d;
        System.out.println("byte dan double = " +b+ " |||| " +d);

        byte x = 20;
        x = (byte) (x * 2);
        System.out.println("Nilai Byte = " +x);
    }
}
