import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int x;
        int y;
        for (int i = 1; i < 10; i++) {
            String str = "";
            for (int j = 1; j < 10; j++) {
                str += (Integer.toString(i) + "*" + Integer.toString(j) + "=" + Integer.toString(i + j) + "\t");
            }
            System.out.println(str);


        }
    }

    static class multitable {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int otvet, a, post;
            boolean result;

            // ввод значения для переменных а,в
            System.out.print("введите любое число: ");
            int x = in.nextInt();
            String str = "";
            a = 0;

            post = a + 1;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 2;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 3;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 4;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 5;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 6;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 7;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 8;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 9;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }
            post = a + 10;
            otvet = x * post;
            result = post <= 10;
            {
                System.out.println((x)+"*"+(post)+"="+(otvet)+"\t");
            }


        }
    }
}



