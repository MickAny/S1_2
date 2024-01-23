import java.util.Arrays;

public class L2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1, 2, 3, 4};
        difBetweenMinAndMax(arr1);

        int[] arr2 = new int[]{2, 2, 0};
        difBetweenMinAndMax(arr2);

        int[] arr3 = new int[]{1, 3, 5};
        difBetweenMinAndMax(arr3);
    }

    public static void difBetweenMinAndMax(int[] array) {

        if(array.length > 0) {
            int result = findMax(array) - findMin(array);
            System.out.print(Arrays.toString(array));
            System.out.print(" -> " + result + "\n");
        }else{
            System.out.println("Array size is inappropriate, try other data");
        }
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i:array) {
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i:array) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }

}

//    Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
