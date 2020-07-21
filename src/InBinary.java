import javax.swing.text.IconView;
import java.util.Scanner;

public class InBinary {
    public static void main(String[] args) {
        // Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран java

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите бинарное число: ");

            int bin = sc.nextInt();
            int binary = bin;
            int dec = 0;
            int power = 0;

            while (true) {

                if (binary == 0) {
                    break;

                } else {

                    int temp = binary % 10;
                    dec += temp * Math.pow(2, power);
                    binary = binary / 10;
                    power++;
                }
            }
            System.out.println("Число в дестичном формате = " + dec);

        }
    }



