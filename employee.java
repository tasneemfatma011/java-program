import java.util.Scanner;

class employee {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter an employee id:");
        int empId = inputScanner.nextInt();
        inputScanner.nextLine(); // Consume the leftover newline

        System.out.println("Enter an employee name:");
        String empName = inputScanner.nextLine();

        System.out.println("Enter a basic salary:");
        float basicSalary = inputScanner.nextFloat();

        float hra = basicSalary * 0.2f;
        float ta = basicSalary * 0.1f;
        float da = basicSalary * 0.1f;
        float grossSalary = basicSalary + hra + ta + da;

        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Basic salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("DA: " + da);
        System.out.println("Gross salary: " + grossSalary);

        inputScanner.close();
    }
}