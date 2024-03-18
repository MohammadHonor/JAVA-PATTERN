
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
         
        
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter number of line");

    int count = sc.nextInt();

        for( int i = count ; i>=0 ; i--){

            for(int j=i ; j>=0 ; j--){

                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }


}
