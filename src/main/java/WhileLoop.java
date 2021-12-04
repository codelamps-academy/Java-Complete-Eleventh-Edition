public class WhileLoop {
    public static void main(String[] args){
        int start = 20;

        while (start > 0){
            System.out.println("Perulangan ke - " +start);
            start--;
        }


        // WHILE FIND MID POINT
        int i, j;
        i = 100;
        j = 200;

        while (++i < --j){
            System.out.println("i : " +i+ " " +"j : " +j);
        }
        System.out.println("Mid Value : " +i); // MID VALUE : 150
    }
}
