import java.util.*;

public class Transpose_array {
    public static void Main(String[] args) {
        int[][] arr = {{1, 2, 5}, {4, 5, 16}, {5, 0, 5}};
        System.out.println("Original array:");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
       
        int[][] transposed = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        
        System.out.println("Transposed array:");
        for (int[] i : transposed) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
