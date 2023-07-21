public class x_pow_n {
    public static int pow(int x , int n){
        if (n == 1) 
        return x;
        if (n == 0) 
        return 1;


        return x * pow(x,n-1);
    } 

    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}
