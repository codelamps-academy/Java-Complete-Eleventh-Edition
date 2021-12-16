public class RecursionExample1 {
    public static void main(String[] args){

        // INSTANSIASI OBJEK
        RecTest myObjek = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) myObjek.values[i] = i;

        myObjek.printArray(10);
    }
}

class RecTest{
    int values[];

    RecTest(int i){
        values = new int[i];
    }

    // DISPLAY ARRAY -- RECURSIVERLY
    void printArray(int i){
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i-1]);
    }
}