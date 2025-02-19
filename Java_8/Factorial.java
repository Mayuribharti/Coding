package Java_8;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();

     int fact = IntStream.rangeClosed(2,n).reduce(1,(a,b)->a*b);
     System.out.println("factorial :"+fact);

     /*

     If the user enters 5, the stream will generate [2, 3, 4, 5], and the reduce() will compute:

         1 * 2 = 2
         2 * 3 = 6
         6 * 4 = 24
         24 * 5 = 120
    So, the output will be factorial: 120.*/
    }
}
