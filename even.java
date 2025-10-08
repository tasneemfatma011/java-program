import java.util.Scanner;
class even{
    public static void main(String[] args) {
         Scanner inputScanner=new Scanner(System.in);
         System.out.println("enter a number:");
         int number=inputScanner.nextInt();
         if(number%2==0){
            System.out.println("number is even");
         }
         else{
            System.out.println("number is odd");
         }

    }
}