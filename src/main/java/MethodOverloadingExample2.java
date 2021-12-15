public class MethodOverloadingExample2 {
    public static void main(String[] args){

        int points = 99;

        // INSTANSIASI OBJEK
        SubClassOverloading myObjek = new SubClassOverloading();
        myObjek.test();
        myObjek.test(10, 20);
        myObjek.test(points);
    }
}


class SubClassOverloading{
    // MEMBUAT METHOD
    void test(){
        System.out.println("No Parameters");
    }

    // MEMBUAT METHOD DENGAN PARAMETER
    void test(int a, int b){
        System.out.println("Value of a : " +a+ " Value of b : " +b);
    }

    // MEMBUAT METHOD DENGAN SATU PAREMTER
    void test(double a){
        System.out.println("Value of double a : " +a);
    }
}