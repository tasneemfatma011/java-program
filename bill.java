import java.util.Scanner;
public class bill{
    public static void main(String[] args) {
        int units;
        float billAmount;
        Scanner inputScanner=new Scanner(System.in);
         System.out.println("enter a number of units consumed:");
         units=inputScanner.nextInt();
         if(units<=100){
            billAmount=units*5;
         }
         else if(units>100 && units<=200){
            billAmount=100*5+(units-100)*7;
         }
         else if(units>200){
            billAmount=100*5+100*7+(units-200)*10;
         }
         else{
            billAmount=100*5+100*7+100*10+(units-300)*15;
         }
         System.out.println("total bill amount:"+billAmount);
    }
    
}
