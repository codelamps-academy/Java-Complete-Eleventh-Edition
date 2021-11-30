import java.util.Scanner;

public class TipeDataLong {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000;
        // SPECIFY NUMBER OF DAYS HERE
        System.out.print("Masukkan Hari : ");
        days = input.nextInt();

        // CONVERT TO SECOND
        seconds = days * 24 * 60 * 60;

        // MENGHITUNG JARAK / COMPUTE DISTANCE
        distance = lightSpeed * seconds;

        // MENAMPILKAN DATA
        System.out.println("In " +days+ " days");
        System.out.println("Light will travel about ");
        System.out.println(distance + " miles");

    }
}
