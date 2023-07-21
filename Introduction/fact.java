public class fact {
    public static int facto(int num){
        if (num==1) {
            return 1;
        }
        else
        return num*facto(num -1);
    }
    public static void main(String[] args) {
        System.out.println(facto(5));
    }
}
