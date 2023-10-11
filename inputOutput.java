import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int AGE = scanner.nextInt();
        double marks = scanner.nextDouble();
        char grade = scanner.next().charAt(0);

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + AGE);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
