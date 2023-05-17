/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras_guia9.ArrayServicio;

import java.util.Arrays;

/**
 *
 * @author Joselo
 */
public class ArrayService {
    
    public static int MSIS(int[] nums) {
        // caso base
        if (nums.length == 0) {
            return 0;
        }

        // array para almacenar soluciones de subproblemas. `sum[i]` almacena el máximo
        // suma de la subsecuencia creciente que termina con `nums[i]`
        int[] sum = new int[nums.length];

        // caso base
        sum[0] = nums[0];

        // comienza desde el segundo elemento de la array
        for (int i = 1; i < nums.length; i++) {
            // hacer para cada elemento en el subarray `nums[0…i-1]`
            for (int j = 0; j < i; j++) {
                // encuentra una subsecuencia creciente con suma máxima que termina con `nums[j]`,
                // donde `nums[j]` es menor que el elemento actual `nums[i]`

                if (sum[i] < sum[j] && nums[i] > nums[j]) {
                    sum[i] = sum[j];
                }
            }

            // incluir `nums[i]` en MSIS
            sum[i] += nums[i];
        }

        // encuentra la subsecuencia creciente con la suma máxima
        return Arrays.stream(sum).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] nums = { 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11 };
        System.out.println("La suma maxima es " +
                           MSIS(nums));
    }
    
    
    
    
}
