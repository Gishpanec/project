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
}