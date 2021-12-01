public class TwoDimensionalArray {
    public static void main(String[] args){

        // MEMBUAT DUA DIMENSIONAL ARRAY
        double dimensionalArray[][] = {
                {0*0, 1*0, 2*0, 3*0},
                {0*1, 1*1, 2*1, 3*1},
                {0*2, 1*2, 2*2, 3*2},
                {0*3, 1*3, 2*3, 3*3}
        };

        int i, j;

        for (i = 0; i < 4; i++){
            System.out.print("{");
            for (j = 0; j < 4; j++){
                System.out.print(dimensionalArray[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
