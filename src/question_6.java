import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {

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

        int otvet, e = 2;
        double result, c = 3;
        otvet = one + too + three;
        result = otvet / c;
        System.out.println("среднего арифметического чисел x, y, z: " + result + "");

        //Деление среднего арифметического на 2 без остатка

       int resultA = (int) (result/e);
        System.out.println("Деление среднего арифметического на 2 без остатка: " + resultA + "");
       /* String korect;
        int number = resultA;

        if (resultA > c) {
            return;
        } else {
            String var2 = korect.toLowerCase();
            byte var3 = -1;
            switch (var2.hashCode()) {
                case 3:
                    if (var2.equals("september")) {
                        var3 = 8;
                    }
                    break;
                {


                    //Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
                    if (resultA > e) ;
                    korect = "Программа выполнена корректно";
                    {
                        System.out.println(resultA + korect);
                    }
                    if (resultA < e) ;
                    {
                        korect = "";
                    }*/
                }


            }

