public class test5 {
static class ModDemo {
    // Демонстрация использования операции%
    public static void main(String args []) {
        int iresult, irem;

        double dresult, drem;

        iresult = 10 / 3;

        irem = 10 % 3;

        dresult = 10.0 / 3.0;

        drem = 10.0 % 3.0;

        System.out.println("Peзyльтaт и остаток от деления 10 / 3: " +

                iresult + " " );
        System.out.println("Peзyльтaт и остаток от деления 10 % 3: " + irem + " ");

        System.out.println("Peзyльтaт и остаток от деления 10.0 / 3.0: "

                + dresult +  "; Peзyльтaт и остаток от деления 10.0 % 3.0: " + drem);


        }
    }
}
