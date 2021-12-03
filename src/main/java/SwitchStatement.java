public class SwitchStatement {
    public static void main(String[] args){

        // SWITCH 1
        int data = 8;

        switch (data){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Jumlah data <= 5");
                break;
            case 6 :
            case 7 :
            case 8 :
            case 9 :
                System.out.println("Jumlah data antara 6 - 9");
                break;
            default :
                System.out.println("Not in range");
        }
    }
}
