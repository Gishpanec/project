import java.util.Scanner;

public class test3 {
    /*Расчет числа кубических дюймов в кубе объемом в 1 куб. милю*/
    static class Inches {

        public static void main(String[] args) {

            long ci;

            long im;

            im = 5280 * 12;

            ci = im * im * im;

            System.out.println("B одной кубической миле содержится " + ci +" кубических дюймов");

        }
    }


/*Определение длины гипотенузы, исходя из длины катетов, по теореме Пифагора*/

static class Hypot {

    public static void main(String args[]) {

        double x, у, z;

        x = 4;

        у = 3;

        z = Math.sqrt(x * x + у * у);

        System.out.println("Длинa гипотенузы: " + z);

    }
}
// Демонстрация использования логических значений

    static class BoolDemo {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            boolean b,a;
            b= false;
            System.out.println("Знaчeниe b: " + b);
            a = true;
            System.out.println("Знaчeниe a " + a);

            // Логическое значение можно использовать для
            // управления условным оператором if

            if (b) {
                System. out. println ( "Эта инструкция вьполняется");
            }
            b = false;
            if(a) {
                System.out.println("Этa инструкция не выполняется");
            }
            // В результате выполнения сравнения получается логическое значение
            System.out.print("Input a number: ");
            int num = in.nextInt();
            System.out.println("Peзyльтaт сравнения 10 > 9: " + (10 > 85));
        }

    }
}