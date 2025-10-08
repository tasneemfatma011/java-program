import java.util.*;
public class natural{
    public static void main(String[] args) {
        int sum=0;
        int count=1;
        System.out.println("enter a natural number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        while(count<=number){
            sum+=count;
            count++;


        }
        System.out.println(sum);
        sc.close();
    }
}