public class StackClass {
    public static void main(String[] args){


    }
}

class SubStackClass{
    // MEMBUAT ARRAY
    int stck[] = new int[10];
    int tos;

    // MEMBUAT CONSTRUCTOR
    SubStackClass(){
        tos = -1;
    }

    //
    void push(int item){
        if (tos == 9){
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }


    }
}