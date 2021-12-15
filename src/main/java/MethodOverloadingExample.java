public class MethodOverloadingExample {
    public static void main(String[] args){

        // INSTANSIASI OBJEK
        OverloadingMethod myObjek = new OverloadingMethod();
        double result; // DIGUNAKAN UNTUK MENYIMPAN METHOD YANG BERISI PARAMETER DOUBLE

        myObjek.myMethod();
        myObjek.myMethod(10);
        myObjek.myMethod(20, 30);
        result = myObjek.myMethod(123.333);

        // KARENA RETURN DARI METHOD YANG BERPARAMETER DOUBLE ITU BELUM DIPANGGIL
        System.out.println("Hasil dari perkalian myObjek.myMethod : " +result);
    }
}

// MEMBUAT CLASS
class OverloadingMethod{

    void myMethod(){
        System.out.println("No Parameters");
    }

    void myMethod(int a){
        System.out.println("Value of a : " +a);
    }

    void myMethod(int a, int b){
        System.out.println("Value of a : " +a+ " Value of b : " +b);
    }

    double myMethod(double a){
        System.out.println("Value of double a : " +a);
        return a * a;
    }
}