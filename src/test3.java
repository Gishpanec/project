public class test3 {

    /*Расчет числа кубических дюймов в кубе объемом в 1 куб. милю*/

    class Inches{
        public static void test3(String args[]) {
            long ci;
            long im;
            im = 5280*12;
            ci = im*im*im;

            System.out.println("В одной кубической миле содержится" + ci + "кубических дюймов");

        }

    }
}
