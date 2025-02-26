import java.util.Arrays;

/**
 * Klasa reprezentująca instancję problemu QUBO.
 * Problem QUBO polega na znalezieniu binarnego wektora minimalizujacego wyrazenie x^T Q x (elementy wektora x to 0 i 1),
 * Q to macierz wspolczynnikow .
 */
public class QUBOProblem {
    
    private double[][] couplingMatrix;
    private int[] optimalState;
    private double optimalStateValue;

    //* Kod implementacji */

 
    

    

    // Metody pomocnicze
    

    private void validateCouplingMatrix(double[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Coupling matrix cannot be null");
        }
        
        int n = matrix.length;
        
        // Check for square matrix
        for (double[] row : matrix) {
            if (row.length != n) {
                throw new IllegalArgumentException("Coupling matrix must be square");
            }
        }
    }
    
    private double[][] deepCopy(double[][] matrix) {
        double[][] copy = new double[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        return copy;
    }

    
    
    public static void main(String[] args) {

        /* */


        }
    
}