public class WhileWithBreak {
    public static void main(String[] args){

        var i = 0;

        while (i < 100){
            if (i >= 50) break;
            System.out.println("Perulangan : " +i);
            i++;
        }
    }
}
