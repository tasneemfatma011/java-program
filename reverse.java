import java.util.*;
public class reverse {
    public static void main(String[]args){
        int rem,rev=0;
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        do { 
            rem=number%10;
            rev=rev*10+rem;
            number/=10;
        } while (number>0);
        System.out.println(rev);
        

    }
}
