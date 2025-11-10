//Hollow Square Pattern//

import java.util.Scanner;
public class Demo4 {
static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter th InputValue");
    int Input=s.nextInt();
    for(int i=1;i<=Input;i++){
        for(int j=1;j<=Input;j++){
            if(i == 1 || i == Input || j == 1 || j == Input){
                System.out.print("*"+" ");
            }
            else{
            System.out.print(" "+" ");
        }
    }
        System.out.println();
    }
    s.close();
}
}
