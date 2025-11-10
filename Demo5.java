import java.util.Scanner;
public class Demo5 {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Value");
int Value=s.nextInt();
int count=1;
for(int i=1;i<=Value;i++){
    for(int j=1;j<=Value;j++){
        if(count < 10){
            System.out.print("0");
        }
        System.out.print(count + " ");
        count++;
    }
    System.out.println();
}
s.close();
}
}
