package Matrix;

public class SearchInSortedMatrix {
    /*
    * Problem Statement
    * For a given NxN sorted matrix, Write a program to find a given key in the matrix.
    *
    * */
    public void search(int[][] matrix,int sizeOfMatrix,int key) {
        int i = 0, j= sizeOfMatrix-1;
        while(i<sizeOfMatrix && j>=0) {
            if(matrix[i][j] == key){
                System.out.println("found "+ key + " at i = "+i+" j = "+j);
                return;
            }
            if(matrix[i][j]>key)j--;
            else i++;
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {10,20,30,34},
                {15,25,31,36},
                {27,29,37,40},
                {32,33,38,51}
        };
        SearchInSortedMatrix sism = new SearchInSortedMatrix();
        sism.search(matrix,4,34);
    }
}
