public class ReturnExample1 {
    public static void main(String[] args){

        boolean kondisi = true;

        System.out.println("Before return");

        if (kondisi) return; // return to caller

        System.out.println("This won't execute");
    }
}
