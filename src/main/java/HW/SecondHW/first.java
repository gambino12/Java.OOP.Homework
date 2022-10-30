
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

package HW.SecondHW;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println(floatNum());
                break;

            } catch (RuntimeException e) {
                System.out.println("Неправильный тип объекта =(");
            }
        }

    }

    /**
     * запрашивает у пользователя число типа float и возвращает его пользователю.
     * @return возвращает запрошенное число у пользователя типа float
     */
    private static float floatNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число через запятую ->");
        return sc.nextFloat();
    }

}


