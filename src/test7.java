import javax.swing.*;

public class test7 {
    public static void main(String[] args) {
        int mouse; //число мышек
        int weight; //вес кота в граммах

        mouse = 0;
        weight = 5500;

        if (mouse != 0 && weight / mouse < 2000) {
            System.out.println("можно  кормить кота");
        }


    }

    static class absval {
        public static void main(String[] args) {
            int absval, val;
            val = 7;
            absval = val < 0 ? -val : val;
            {
                //выводим число
                System.out.println("" + absval);
            }
            val = -7;
            absval = val < 0 ? val : val;
            {
                System.out.println("" + absval);
            }
        }
    }
}