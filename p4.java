import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        //hollow triangle
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int row=sc.nextInt();
        int temp=row+1;
        for(int i=row ;i>0 ;i--){
            for(int j=i; j>0; j--){

                System.out.print(" ");
            }
            if(i==row){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
           
            for(int k=1; k<temp-i; k++){
                

                if(
                    i==1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
                   
            
              
            }
            System.out.println("*");
          
            
        }
    }
    
}
