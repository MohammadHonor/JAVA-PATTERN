import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        //reverse hollow triangle
         System.out.print("Enter the number of row:");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1; i<=row ; i++){
            for( int j=1 ; j<row*2 ; j++){

                if( i+j == i*2 || j+i ==row*2 || i==1){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
