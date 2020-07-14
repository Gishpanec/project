public class test6 {
    // метод для шифровки текста с помощью XOR
    public static byte[] encode(String secret, String key) {
        byte[] btxt =null;
        byte[] bkey = null;

        btxt = secret.getBytes();
        bkey = key.getBytes();

        byte[] result = new byte[secret.length()];
        for (int i =0; i<btxt.length; i++) {
            result[i] = (byte) (btxt[i] ^ bkey[i % bkey.length]);
        }
        return result;
    }
    //метод расшифровки текста
    public static String decode(byte[]secret,String key){
        byte[] result = new byte[secret.length];
        byte[] bkey = key.getBytes();

        for (int i=0; i<secret.length; i++){
            result[i] = (byte)(secret[i]^ bkey[i%bkey.length]);
        }
        return new String(result);
    }
}
