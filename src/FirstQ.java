import java.util.Scanner;
public class FirstQ {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Of 1st Subject");
        int M1 = sc.nextInt();
        System.out.println("Enter Marks Of 2nd Subject");
        int M2 = sc.nextInt();
        System.out.println("Enter Marks Of 3rd Subject");
        int M3 = sc.nextInt();
        System.out.println("Enter Marks Of 4th Subject");
        int M4 = sc.nextInt();
        System.out.println("Enter Marks Of 5th Subject");
        int M5 = sc.nextInt();
        int sum = M1 + M2 + M3 + M4 + M5 ;
        System.out.println(" Totals Marks Is ");
        System.out.println(sum);
        System.out.println(" Percentage Is");
        double percentage = (sum * 0.2);
        System.out.println(percentage);

    }
}
