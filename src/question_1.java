import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);
        System.out.println("Введите цифру 1: ");
        int numb = dig.nextInt();
        String numerall;
        while (true) {

            if (numb != 1) {
                break;

            } else System.out.println ("Вы ввели число: " + numb);
            break;

        }

    }
}
