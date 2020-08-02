import java.util.Scanner;

public class question_6 {
    public static void main(String [] args){
        //Ввод трех чисел с клавиатуры x, y, z
        Scanner a = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        int one = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Введите значение b: ");
        int too = a.nextInt();
        Scanner z = new Scanner(System.in);
        System.out.println("Введите введите значение z: ");
        int three = a.nextInt();
        //Нахождение и вывод на экран среднего арифметического чисел x, y, z
        double otvet;
        otvet = Math.sqrt((one + too + three)%3);
        System.out.println("среднего арифметического чисел x, y, z: " + otvet );
        //Деление среднего арифметического на 2 без остатка
         //if
        //System.out.println("Деление среднего арифметического на 2 без остатка " + result + "");

    }
}
