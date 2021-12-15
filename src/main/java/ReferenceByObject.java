public class ReferenceByObject {
    public static void main(String[] args){

        // INSTANSIASI OBJEK
        ReferenceObject myFirstObject = new ReferenceObject();

        int a = 10, b = 20;

        System.out.println("Value sebelum di terapkan di method " +a+ " " +b);

        myFirstObject.myMethod(a, b);

        System.out.println("Value sesudah di terapkan di method " +a+ " " +b);

        System.out.println("======================================================");

        ReferenceObject mySecondObject = new ReferenceObject(10, 20);

        System.out.println("Value a dan b = " +mySecondObject.x+ " " +mySecondObject.y);

        mySecondObject.myObjectMethod(mySecondObject);

        System.out.println("Value a dan b = " +mySecondObject.x+ " " +mySecondObject.y);
    }
}

class ReferenceObject{

    int x, y;

    // MEMBUAT CONSTRUCTOR TANPA PARAMETER
    ReferenceObject(){

    }

    // MEMBUAT CONSTRUCTOR DENGAN PARAMETER
    ReferenceObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    void myMethod(int a, int b){
        a *= 2;
        b /= 2;
    }

    // MEMBUAT METHOD PASS BY OBJECT
    void myObjectMethod(ReferenceObject o){
        o.x *= 2;
        o.y /= 2;
    }
}