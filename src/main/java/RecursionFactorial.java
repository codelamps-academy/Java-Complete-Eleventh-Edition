public class RecursionFactorial {
    public static void main(String[] args){

        // INSTANSIASI OBJEK
        Factorial myObjek = new Factorial();
        int data1 = myObjek.fact(10);
        int data2 = myObjek.fact(5);
        int data3 = myObjek.fact(3);

        System.out.println("Factorial dari 10 = " +data1);
        System.out.println("Factorial dari 5 = " +data2);
        System.out.println("Factorial dari 3 = " +data3);


    }
}

class Factorial{

    int fact(int x){
        int result;

        if (x == 1) return 1;
        result = fact(x - 1) * x;
        return result;
    }
}