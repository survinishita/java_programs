import java.util.Scanner;

public class Sepeleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept marks
        System.out.print("Enter marks for Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double m3 = sc.nextDouble();

        // Calculate total and average
        double total = m1 + m2 + m3;
        double average = total / 3;

        // Display results
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}

