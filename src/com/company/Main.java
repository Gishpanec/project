package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!"); //простой вывод на экран


        /*вывод данных в консоль с переносом текста*/

        System.out.println("Hello, world!");
        System.out.println("Bye world...");

        /*вывод данных в консоль без переноса строк*/

        System.out.print("Hello, world!");
        System.out.print("Bye world... \n");

        /* вывод данных */
        int x=6;
        int y=5;
        System.out.println("x="+x+";y="+y);

        /*переписывание предыдущего примера
        public class test {

            public static void main(String[] args) {
                int x = 7;
                int y = 8;
                System.out.printf("x=%d; y=%d \n, x, y");
            }
        }*/
    }
}