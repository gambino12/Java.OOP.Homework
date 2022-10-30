package HW.SecondHW;

import java.util.Scanner;

public class third {
    public static void main(String[] args){
          System.out.println(print());
    }
    static String print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку->");
        String stroka = sc.nextLine();
        if (stroka.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя.");
        }
        else
            return stroka;
    }
}
