/*public class test6 {
    static class encode {
        public static void main(String[] args) {
// метод для шифровки текста с помощью XOR
            String secret = "", key = "";

            byte[] btxt = null;
            byte[] bkey = null;


            btxt = secret.getBytes();

            bkey = key.getBytes();

            byte[] result = new byte[secret.length()];

            for (int i = 0; i < btxt.length; i++) {

                result[i] = (byte) (btxt[i] ^ bkey[i % bkey.length]);

            }


        }
    }

    static class decode {

// метод для расшифровки текста

        public static void main(String[] args) {

            String secret = "", key = "";

            byte[] result = new byte[secret.length()];

            byte[] bkey = key.getBytes();

            for (int i = 0; i < secret.length(); i++) result[i] = (byte) (secret[i] ^ bkey[i % bkey.length]);


        }
    }

}
               /*byte[] b;

            byte[] encode(String secret, String key){



                byte[] btxt = null;

                byte[] bkey = null;


                btxt = secret.getBytes();

                bkey = key.getBytes();


                byte[] result = new byte[secret.length()];


                for (int i = 0; i < btxt.length; i++) {

                    result[i] = (byte) (btxt[i] ^ bkey[i % bkey.length]);

                }



            }
        }
    }
    /*
// метод для расшифровки текста

        public static String decode ( byte[] secret key){
            byte[] result = new byte[secret.length];
            byte[] bkey = key.getBytes();

            for (int i = 0; i < secret.length; i++) {

                result[i] = (byte) (secret[i] ^ bkey[i % bkey.length]);
            }
            return new String(result);
        }
    }
*/