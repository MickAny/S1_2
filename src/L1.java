import java.util.Arrays;

public class L1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1, 2, 3, 4};
        evenArrayMembers(arr1);

        int[] arr2 = new int[]{2, 2, 0};
        evenArrayMembers(arr2);

        int[] arr3 = new int[]{1, 3, 5};
        evenArrayMembers(arr3);
    }

    public static void evenArrayMembers(int[] array){
         int CNTR = 0;
        for (int i:array) {
            if(array[i]%2 == 0){
                CNTR++;
            }
        }
        System.out.print(Arrays.toString(array));
        System.out.print(" -> " + CNTR + "\n");
     }
}
//    Написать метод, возвращающий количество чётных элементов массива.
//    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0




