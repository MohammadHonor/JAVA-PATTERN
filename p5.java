import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        System.out.print("Enter the number of row:");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1; i<=row ; i++){
            for( int j=1 ; j<row*2 ; j++){

                if( i+j == row+1 || j-i == row-1 || i==row){
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
