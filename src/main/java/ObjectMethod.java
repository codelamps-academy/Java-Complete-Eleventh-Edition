public class ObjectMethod {
    public static void main(String[] args){

        // INSTANSIASI OBJEK
        Test myObjek1 = new Test(10);
        Test myObjek2;

        myObjek2 = myObjek1.incrByTen();
        myObjek1.incrByTen();

        System.out.println("myObjek1.a = " +myObjek1.a);

        System.out.println("myObjek2.a = " +myObjek2.a);

    }
}

class Test{
    // MEMBUAT FIELD
    int a;

    // MEMBUAT CONSTRUCTOR
    Test(int a){
        this.a = a;
    }

    // MEMBUAT METHOD DARI OBJECT
    Test incrByTen(){
        Test myObjek = new Test(a + 10);
        return myObjek;
    }
}