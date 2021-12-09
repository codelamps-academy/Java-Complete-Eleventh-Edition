public class CreateClass2 {
    public static void main(String[] args){

        // INSTANSIASI OBJEK DARI KELAS OTHER CLASS, DAN MEMBUAT DUA OBJEK
        OtherClass myFirstObjek = new OtherClass();
        myFirstObjek.width = 10;
        myFirstObjek.height = 20;
        myFirstObjek.depth = 15;

        OtherClass mySecondObjek = new OtherClass();
        mySecondObjek.width = 20;
        mySecondObjek.height = 30;
        mySecondObjek.depth = 25;

        // MENGHITUNG VOLUME DARI OBJEK PERTAMA
        var volumeFirstObjek = myFirstObjek.width * myFirstObjek.height * myFirstObjek.depth;
        System.out.println("Volume First Objek = " +volumeFirstObjek);

        // MENGHITUNG VOLUME DARI OBJEK KEDUA
        var volumeSecondObjek = mySecondObjek.width * mySecondObjek.height * mySecondObjek.depth;
        System.out.println("Volume Second Objek = " +volumeSecondObjek);
    }
}


class OtherClass{
    // MEMBUAT INSTANCE VARIABLE / FIELD
    double width;
    double height;
    double depth;
}