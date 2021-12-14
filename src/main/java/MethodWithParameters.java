public class MethodWithParameters {
    public static void main(String[] args){

        // INISIALISASI OBJEK
        SubClass2 myFirstObjek = new SubClass2();
        SubClass2 mySecondObjek = new SubClass2();

        // SET NILAI
        myFirstObjek.MethodParameter(10, 20, 15);
        mySecondObjek.MethodParameter(20, 30, 25);

        // MENGHITUNG
        double x = myFirstObjek.returnMethod();
        double y = mySecondObjek.returnMethod();

        // MENAMPILKAN
        System.out.println("Volume = " +x);
        System.out.println("Volume = " +y);
    }
}


class SubClass2{
    double width;
    double height;
    double depth;

    // MEMBUAT METHOD DENGAN PARAMETER
    void MethodParameter(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // MEMBUAT METHOD TANPA PARAMETER
    double returnMethod(){
        return width * height * depth;
    }

}