public class ForEachExample {
    public static void main(String[] args){

        // MEMBUAT ARRAY, DAN MENAMPILKAN MENGGUNAKAN PERULANGAN FOR EACH
        int data[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum = 0;

        for(int values : data){
            sum += values;
        }
        System.out.println("Jumlah = " +sum);


        // FOR EACH BREAK
        System.out.println("===================FOR EACH BREAK======================");
        int dataArray[] = {1,2,3,4,5,6,7,8,9,10};
        int tambah = 0;

        for (var simpan : dataArray){
            tambah += simpan;
            System.out.println("Data - " +simpan );
            if (simpan >= 5) break;
        }
        System.out.println("Jumlah simpan = " +tambah);
    }
}
