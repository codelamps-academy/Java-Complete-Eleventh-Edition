public class ForWithBreak {
    public static void main(String[] args){

        for (var i = 0; i <= 100; i = i + 1){
            if (i == 50) break;
            System.out.println("Perulangan = " +i);
        }


    }
}
