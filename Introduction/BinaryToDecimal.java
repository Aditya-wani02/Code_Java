 class Convert
{
    public String toBinary(int decimal){
        String result = "";
        while (decimal != 0) {
            int lastbit = decimal & 1;
            result = lastbit + result;
            decimal = decimal >>1;
        }
        return result;
    }
}



public class BinaryToDecimal{


public static void main(String[] args) {
    Convert con = new Convert();
    System.out.println(con.toBinary(31));
}

}