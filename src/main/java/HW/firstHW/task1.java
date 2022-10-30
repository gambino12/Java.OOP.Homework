package HW.firstHW;

import java.util.Arrays;
//1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class task1 {

   static int[] arr1 = {2,4,6,8,10,12,14};
   static int[] arr2 = {1,2,3,4,5,6,7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(DiffOfNumbers(arr1, arr2)));
    }

    /**
     * принимает 2 массива и возвращает новый массив с разностью чисел на одинаковых позициях.
     * @param arr1 первый массив.
     * @param arr2 второй массив.
     * @return возвращает исключение если массивы не равны или равны нулю,в случае если они одинаковы возвращает
     * новый массив где каждый элемент это разность элементов стоящих на тех же позициях в массивах которые мы принимали.
     */
    private static int[] DiffOfNumbers(int[]arr1,int[]arr2){
        if (arr1 == null||arr2==null)
            throw new RuntimeException("Any of the arrays is null");
        if (arr1.length!=arr2.length){
            throw new RuntimeException("Еhe length of the arrays is different");
        }
        int[]arr = new int[arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i]-arr2[i];
        }
        return arr;
    }


}
