package HW.firstHW;

import java.util.Arrays;

public class task2 {
    static int[] arr1 = {2,6,6,8,10,12,14};
    static int[] arr2 = {1,2,4,4,5,6,7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(DividingNumbers(arr1, arr2)));
    }

    /**
     * метод принимающий в качестве аргументов два целочисленных массива,
     * и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке
     * @param arr1 первый массивю
     * @param arr2 второй массив.
     * @return возвращающает новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке
     */
    private static int[] DividingNumbers(int[]arr1,int[]arr2){
        if (arr1 == null||arr2==null)
            throw new RuntimeException("Any of the arrays is zero");
        if (arr1.length!=arr2.length){
            throw new RuntimeException("Еhe length of the arrays is different");
        }
        int[]arr = new int[arr1.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i]!= 0)
            arr[i] = arr1[i]/arr2[i];
            else
                throw new RuntimeException("you can't divide by zero");
        }
        return arr;
    }
}
