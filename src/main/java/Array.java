import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        // MEMBUAT ARRAY
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 30;

        System.out.println("Jumlah Hari dalam January = " +month_days[0]);
        System.out.println("Jumlah Hari dalam February = " +month_days[1]);
        System.out.println("Jumlah Hari dalam March = " +month_days[2]);
        System.out.println("Jumlah Hari dalam April = " +month_days[3]);
        System.out.println("Jumlah Hari dalam Mei = " +month_days[4]);
        System.out.println("Jumlah Hari dalam Juni = " +month_days[5]);
        System.out.println("Jumlah Hari dalam Juli = " +month_days[6]);
        System.out.println("Jumlah Hari dalam Agustus = " +month_days[7]);
        System.out.println("Jumlah Hari dalam September = " +month_days[8]);
        System.out.println("Jumlah Hari dalam Oktober = " +month_days[9]);
        System.out.println("Jumlah Hari dalam November = " +month_days[10]);
        System.out.println("Jumlah Hari dalam Desember = " +month_days[11]);

        System.out.println("================================================================");

        // ARRAY
        // AN IMPROVED VERSION OF THE PREVIOUS PROGRAM.
        int day_month[] = {31,29,31,30,31,30,31,31,30,31,30,31};

        for (var dataMonth : day_month) {
            System.out.println("Jumlah Hari = " +dataMonth);
        }
    }
}
