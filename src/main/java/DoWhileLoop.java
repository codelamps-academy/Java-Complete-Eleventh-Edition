import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Add Fruit");
            System.out.println("2. Show Fruit");
            System.out.println("3. Delete Fruit");
            System.out.println("4. Describe Fruit");
            System.out.println("0. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            int choice = input.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("==== TAMBAHKAN BUAH ====");
                    System.out.println("Masukkan Nama Buah : ");
                    String buah = input.next();
                    break;
                case 0 :
                    System.exit(0);

            }
        } while (true);
    }
}
