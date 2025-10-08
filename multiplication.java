import java.util.*;
class multiplication{
    public static void main(String[] args) {
        int n=10,i=1;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        do { 
            System.out.println(number*i);
            i++;
        } while (i<=n);
    }
}

