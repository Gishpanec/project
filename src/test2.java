import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*отображение введенного числа*/
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);

        /*ввод и вывод типов String, int, float */
        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.3f \n", name, age, height);
    }
}

