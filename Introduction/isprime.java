


public class isprime {

public static boolean checkprime(int num){
     for (int i = 2; i < num-1; i++) {
        if (num % i == 0) {
            return false;
        }
     }
     return true;
}
    public static void main(String[] args) {
        System.out.println(checkprime(3));
    }
}
