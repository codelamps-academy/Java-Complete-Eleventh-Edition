import java.util.Scanner;

public class DoWhileLoopMenu {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Help on : ");
            System.out.println("1. If ");
            System.out.println("2. Switch ");
            System.out.println("3. While ");
            System.out.println("4. Do While ");
            System.out.println("5. For");
            System.out.println("0. Exit");
            System.out.println("Choose one : ");
            int choices = input.nextInt();

            switch (choices){
                case 1:
                    System.out.println("The If : \n");
                    System.out.println("If (condition) {");
                    System.out.println("// Code Statement");
                    System.out.println("} else {");
                    break;
                case 2:
                    System.out.println("The Switch : \n");
                    System.out.println("Switch Expression {");
                    System.out.println("Case Constant :");
                    System.out.println("Statement Squance");
                    System.out.println("Break;");
                    System.out.println(" //...");
                    System.out.println("}");
                    break;
                case 3:
                    System.out.println("The While : \n");
                    System.out.println("While (Condition) Statement");
                    break;
                case 4:
                    System.out.println("The do-While : \n");
                    System.out.println("do {");
                    System.out.println(" Statement;");
                    System.out.println("} while (condition)");
                    break;
                case 5:
                    System.out.println("The For Loop : \n" +
                            "for(condition){" +
                            "// Code Statement" +
                            "}");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}

