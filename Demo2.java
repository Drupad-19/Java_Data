//static methode class

import java.util.Scanner;
class Mode{
   static void pattern(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the n"+" "+ "value");
int n=s.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        System.out.print("*");
    }
    System.out.println();
}
s.close();
}
}
class Demo2 {
public static void main(String [] args){
  Mode.pattern();
}
}
