class Conver {
public int  toDecimal(int Binary){
    int result = 0, index = 0;
    while(Binary !=0)
{
    int lastdiigit = Binary % 10;
    if(lastdiigit == 1)
    {
        result = result + (int)Math.pow(2, index);
    }
    index ++;
    Binary = Binary /10;
}
    return result;
}
   
}



 class DecimaltoBinary {
  public static void main(String[] args) {
    Conver con = new Conver();
    System.out.println(con.toDecimal(1111));
  }   
}