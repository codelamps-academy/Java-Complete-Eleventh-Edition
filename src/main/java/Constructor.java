public class Constructor {
    public static void main(String[] args){

        // INSTANSIASI OBJEK
        SubClass myFirstObjek = new SubClass(10, 20, 15);
        SubClass mySecondObjek = new SubClass(20, 30, 25);

        var firstVolume = myFirstObjek.volume();
        var secondVolume = mySecondObjek.volume();

        // MENAMPILKAN
        System.out.println(firstVolume);
        System.out.println(secondVolume);
    }
}


// MEMBUAT CLASS SUBCLASS
class SubClass{
    // MEMBUAT FIELD / ATTRIBUT
    double width;
    double height;
    double depth;

    // MEMBUAT CONSTRUCTOR NO PARAMETER
    public SubClass(){

    }

    // MEMBUAT CONSTRUCTOR DENGAN PARAMETER
    public SubClass(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //  MEMBUAT METHOD
    double volume(){
        return width * height * depth;
    }
}