
import java.util.Scanner;
public class Demo6 {
public static void main(String [] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number Matricx");
 int Matricx=s.nextInt();
 for(int i=1;i<=Matricx;i++){
    for(int j=1;j<=Matricx;j++){
     int value=(i+j)-1;
        if(value < 10){
            System.out.print("0" + value +" ");
        }
        else{
        System.out.print(value + " ");
    }
 }
   System.out.println();
}
 s.close();
}
}
