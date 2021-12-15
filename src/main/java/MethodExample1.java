public class MethodExample1 {
    public static void main(String[] args){

        // INSTANSIASI OBJEK
        SubMethodClass myFirstObjek = new SubMethodClass();
        SubMethodClass mySecondObjek = new SubMethodClass();

        // MEMBERI NILAI PADA OBJEK PERTAMA
        myFirstObjek.width = 10;
        myFirstObjek.height = 20;
        myFirstObjek.depth = 15;

        // MEMBERI NILAI PADA OBJEK KEDUA
        mySecondObjek.width = 20;
        mySecondObjek.height = 30;
        mySecondObjek.depth = 25;

        // MEMANGGIL METHOD OBJEK PERTAMA
        myFirstObjek.myMethod();

        // MEMANGGIL METHOD OBJEK KEDUA
        mySecondObjek.myMethod();

    }
}


class SubMethodClass{
    // MEMBUAT VARIABLE / FIELD
    double width;
    double height;
    double depth;

    // MEMBUAT METHOD
    void myMethod(){
        System.out.println("The Volume is : ");
        System.out.println(width * height * depth);
    }
}