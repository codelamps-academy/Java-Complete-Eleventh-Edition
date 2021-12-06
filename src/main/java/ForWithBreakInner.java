public class ForWithBreakInner {
    public static void main(String[] args){

        for (int i = 0; i < 3; i++){
            System.out.print("Pass " +i+ " : ");
            for (int j = 0; j <= 10; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println("Loops Complete");
    }
}
