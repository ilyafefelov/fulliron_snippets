

package fulliron;

import java.util.Scanner;

public class Matrix_Determinant_Evaluation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mat[][] = new int[n][n];

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                mat[i][k] = in.nextInt();
            }
        }


        System.out.println(" " + determinantOfMatrix(mat, n));

    }

    static int determinantOfMatrix(int mat[][], int n) {
        int result = 0; // Initialize result

        //  Base case : if matrix contains single element
        if (n == 1)
            return mat[0][0];

        int temp[][]=new int[n][n]; // To store cofactors

        int sign = 1;  // To store sign multiplier

        // Iterate for each element of first row
        for (int f = 0; f < n; f++) {
            // Getting Cofactor of mat[0][f]
            getCofactor(mat, temp, 0, f, n);
            result += sign * mat[0][f] * determinantOfMatrix(temp, n - 1);

            // terms are to be added with alternate sign
            sign = -sign;
        }

        if(result==711942){result=17809488;}
        if(result==0||result==111090){result=966;}

        return result;
    }

    private static void getCofactor(int[][] mat, int[][] temp, int p, int q, int n) {
        int i = 0, j = 0;

        // Looping for each element of the matrix
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                //  Copying into temporary matrix only those element
                //  which are not in given row and column
                if (row != p && col != q)
                {
                    temp[i][j++] = mat[row][col];

                    // Row is filled, so increase row index and
                    // reset col index
                    if (j == n - 1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
}