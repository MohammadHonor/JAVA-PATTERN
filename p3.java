import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        int temp=row+1;
        for(int i =row; i>0; i--){
            for( int j=i ; j>0; j--){
                System.out.print(" ");
            }
            for( int k=1 ; k <= temp-i; k++){
                 System.out.print("*");
            }
            
            for( int l=1 ; l <=row-i; l++){
                if(i==temp-1){
                    continue;
                }
                else{
                    System.out.print("*");
                }
                
           }
            
            System.out.println();
        }


        sc.close();
    }
    
}
