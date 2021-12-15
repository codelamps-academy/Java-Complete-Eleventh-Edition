public class MethodReturnExample1 {
    public static void main(String[] args){
        // MEMBUAT OBJEK PERTAMA
        MySubClass myFirstObjek = new MySubClass();
        myFirstObjek.width = 10;
        myFirstObjek.height = 20;
        myFirstObjek.depth = 15;

        // MEMBUAT OBJEK KEDUA
        MySubClass mySecondObjek = new MySubClass();
        mySecondObjek.width = 20;
        mySecondObjek.height = 30;
        mySecondObjek.depth = 25;

        // MEMANGGIL METHOD
        var myFirstValue = myFirstObjek.volume();
        System.out.println(myFirstValue);

        var mySecondValue = mySecondObjek.volume();
        System.out.println(mySecondValue
        );
    }
}


class MySubClass{
    // MEMBUAT VARIABLE
    double width;
    double height;
    double depth;

    // MEMBUAT METHOD, YANG MEMILIKI KEMBALIAN / RETURN
    public double volume(){
        var compute = width * height * depth;
        return compute;
    }
}