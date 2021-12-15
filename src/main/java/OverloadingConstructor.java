public class OverloadingConstructor {
    public static void main(String[] args){

        // INSTANSIASI OBJEK KELAS SUBCLASSCONSTRUCTOR
        SubClassConstructor myFirstObjek = new SubClassConstructor();
        SubClassConstructor mySecondObjek = new SubClassConstructor(10, 20, 15);
        SubClassConstructor myThirdObjek = new SubClassConstructor(15);

        // MEMANGGIL METHOD MYTOTAL, DARI SETIAP OBJEK
        var data1 = myFirstObjek.myTotal();
        var data2 = mySecondObjek.myTotal();
        var data3 = myThirdObjek.myTotal();

        // MENAMPILKAN
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }
}

class SubClassConstructor{

    // MEMBUAT FIELD
    double width;
    double height;
    double depth;

    // MEMBUAT CONSTRUCTOR TANPA PARAMETER
    SubClassConstructor(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // MEMBUAT CONSTRUCTOR DENGAN PARAMETER LENGKAP
    SubClassConstructor(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // MEMBUAT CONSTRUCTOR 1 PARAMETER
    SubClassConstructor(double values){
        width = height = depth = values;
    }

    // MEMBUAT METHOD PERKALIAN ANTAR FIELD
    double myTotal(){
        return width * height * depth;
    }

}