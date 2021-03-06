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


        System.out.println("===========================================");

        int month = 11;
        String season;

        switch (month){
            case 12 :
            case 1 :
            case 2 :
                season = "Winter";
                break;
            case 3 :
            case 4 :
            case 5 :
                season = "Spring";
                break;
            case 6 :
            case 7 :
            case 8 :
                season = "Summer";
                break;
            case 9 :
            case 10 :
            case 11 :
                season = "Autumn";
                break;
            default :
                season = "Wrong Month";
        }

        System.out.println("Season saat ini : " + season);


        System.out.println("=================================================");

        String str = "four";

        switch (str){
            case "one" -> System.out.println("Satu");
            case "two" -> System.out.println("Dua");
            case "three" -> System.out.println("Tiga");
            case "four" -> System.out.println("Empat");
            case "five" -> System.out.println("Lima");
            case "six" -> System.out.println("Enam");
            case "seven" -> System.out.println("Tujuh");
            case "eight" -> System.out.println("Delapan");
            case "nine" -> System.out.println("Sembilan");
            case "tem" -> System.out.println("Sepuluh");
        }
    }
}
