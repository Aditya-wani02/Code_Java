

public class count1bit {
    public static void main(String[] args) {
        int n = 7, count = 0 ,lastbit , num;
        int arr[] = new int[10] ;
        for(int i = 0 ;  i <= n ; i++){
        num = i;
        count=0;
        while(num != 0){
            lastbit = num & 1;
            if(lastbit ==1 )
             count++;
                
             num = num >> 1;
            

        }
        arr[i] = count;
    }
    for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
    }
    }
}
