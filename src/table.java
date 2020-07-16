public class table {
    public static void main(String [] args){
        int x;
        int y;
        for (int i=1;i<10;i++){
            String str = "";
            for (int j=1;j<10;j++){
                str+=(Integer.toString(i)+"*"+Integer.toString(j)+"="+Integer.toString(i+j)+"\t");
            }
            System.out.println(str);


        }
    }
}
