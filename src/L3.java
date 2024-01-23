import java.util.Arrays;

public class L3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1, 2, 3, 4};
        System.out.println(checkZeroNeighborhood(arr1));

        int[] arr2 = new int[]{2, 2, 0};
        System.out.println(checkZeroNeighborhood(arr2));

        int[] arr3 = new int[]{1, 3, 5};
        System.out.println(checkZeroNeighborhood(arr3));

        int[] arr4 = new int[]{2, 124, 122, 0, 0, 1235, 0, 13513};
        System.out.println(checkZeroNeighborhood(arr4));
    }

    public static boolean checkZeroNeighborhood(int[] array){
        System.out.print(Arrays.toString(array) + " -> ");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                return false;
            }
            if(array[i] == 0 && array[i+1] == 0){
                return true;
            }
        }
        return false;
    }
}

//    Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.