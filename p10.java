import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 9:");
        int number = sc.nextInt();
        for(int i= 1 ; i<=number; i++){

            for( int j=1; j<=number-i ; j++){

                System.out.print(" ");
            }
            for(int k=1 ; k<=i ; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }

}
