/*
Урок 2.4, сортировка слиянием дух массиов без использования метода arrays.sort )))
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 3, 4, 5};
        int[] iter = mergeArrays(a1, a2);
        for (int i = 0; i < iter.length; i++) {
            System.out.print(iter[i] + " ");
        }
    }



    public static int[] mergeArrays(int[] a1, int[] a2) {
        return a1; // your implementation here
    }
}
