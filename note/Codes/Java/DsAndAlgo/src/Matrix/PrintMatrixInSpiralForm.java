package Matrix;

public class PrintMatrixInSpiralForm {

    private void printMatrix(int [][] matrix, int column, int row) {
        int c = 0, r = 0;
        while(c<column && r<row){
            for(int i = c;i<column;i++){
                System.out.print(matrix[r][i]+" ");
            }
            r++;
            for(int i = r;i<row;i++){
                System.out.print(matrix[i][column-1]+" ");
            }
            column--;
            for(int i = column-1; i>=c;i--){
                System.out.print(matrix[row-1][i]+" ");
            }
            row--;
            for(int i = row-1;i>=r;i--){
                System.out.print(matrix[i][c]+" ");
            }
            c++;
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {10,20,30,34},
                {15,25,31,36},
                {27,29,37,40},
                {32,33,38,51}
        };
        int [][] matrix1 = {
                {10,20,30,34},
                {15,25,31,36},
                {27,29,37,40},
                {32,33,38,51},
                {39,40,43,52}
        };
        PrintMatrixInSpiralForm pmsf = new PrintMatrixInSpiralForm();
        pmsf.printMatrix(matrix1,4,5);
    }
}
