import java.util.Scanner;  
public class hollowDiamond {  
    public static void main(String args[]){  
        @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);  
        System.out.print("Enter the number of rows: ");  
        //reads an integer (rows) from the user  
        int rows=scan.nextInt();  

        //prints upper section of the pattern  
        for(int i=1; i<=rows; i++){  
            for(int j=rows; j>i; j--){       
                System.out.print(" ");  
            }  
            //prints symbol  
            System.out.print("*");  
            for(int j=1; j<(i-1)*2; j++){       
                System.out.print(" ");  
            }  
            if(i==1){  
                //throws cursor to the next line      
                System.out.print("\n");  
            }  
            else{  
                //prints symbol and throws cursor to the next line          
                System.out.print("*"+"\n");  
            }  
        }  

        //prints lower section of the pattern  
        for(int i=rows-1; i>=1; i--){  
            for(int j=rows; j>i; j--){         
                System.out.print(" ");  
            }  
            System.out.print("*");  
                for(int j=1; j<(i-1)*2; j++){        
                    System.out.print(" ");  
                }  
            if(i==1){          
                System.out.print("\n");  
            }  
            else{       
                System.out.print("*"+"\n");  
            }  
        }  
    }  
}  