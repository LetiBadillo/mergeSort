/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmergesort;
import java.util.Arrays;
/**
 *
 * @author ASUS
 */
public class EDMergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arreglo= {45, 2300, 11, 9, -10, 403, -8272, 92, 1, 871, 222, 784, 45, 1, -79889754};
        arreglo= mergeSortClass.mergeSort(arreglo);
        System.out.println(Arrays.toString(arreglo));
        
    }
    
}
