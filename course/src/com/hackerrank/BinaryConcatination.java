public class BinaryConcatination {
  public static void main(String[] args) {
        StringBuffer concatenatedString = new StringBuffer("");
        for( int i = 1 ; i <= 12 ; i++){
            concatenatedString .append(Integer.toBinaryString(i)) ;
        }
        System.out.println(concatenatedString);
        System.out.println(Long.parseLong(concatenatedString.toString(),2));
    }
}
