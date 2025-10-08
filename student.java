import java.util.Scanner;
class student{
    public static void main(String[] args) {
        int total;
        float average;
         Scanner inputScanner=new Scanner(System.in);
         System.out.println("enter a math marks :");
         int math = inputScanner.nextInt();
         System.out.println("enter a science marks :");
         int science = inputScanner.nextInt();
         System.out.println("enter a english marks :");
         int english = inputScanner.nextInt();
         total=math+science+english;
         System.out.println("total marks:"+total);
         average=total/3;
         System.out.println("average marks:"+average);
         if(average>=90){
            System.out.println("grade A");
         }
         else if(average>=80){
            System.out.println("grade B");
         }
         else if(average>=70){
            System.out.println("grade C");
         }
         else if(average>=60){
            System.out.println("grade D");
         }
         else{
            System.out.println("grade F");
         }

         

    }
}