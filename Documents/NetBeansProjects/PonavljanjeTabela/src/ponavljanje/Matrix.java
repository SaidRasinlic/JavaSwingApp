package ponavljanje;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int A1[] = {6, 2, 3};
        int B1[] = {2, 5, 6};
        int C1[] = new int[A1.length];

        for (int i = 0; i < A1.length; i++) {

         C1[i] =B1[i]+A1[i];
                
        }
        System.out.println(Arrays.toString(C1));
        
        int[][] A = {
            {2, 4, 5},
            {1, 3, 7},
            {6, 2, 8}
        };

        int[][] B = {
            {1, 3, 1},
            {8, 9, 4},
            {5, 3, 2}

        };

        int[][] C = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + "  ");

            }
            System.out.println("");

        }
    }
}
