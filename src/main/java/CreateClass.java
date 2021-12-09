public class CreateClass {
    public static void main(String[] args){

        // INSTANSIASI OBJEK DARI CLASS DEMO
        Demo myFirstObject = new Demo();
        myFirstObject.width = 10;
        myFirstObject.height = 20;
        myFirstObject.depth = 15;

        // MENJUMLAHKAN VOLUME DARI OBJEK MYFIRSTOBJECT
        var volume = myFirstObject.width * myFirstObject.height * myFirstObject.depth;
        System.out.println("Volume = " +volume);
    }
}

class Demo{
    double width;
    double height;
    double depth;
}