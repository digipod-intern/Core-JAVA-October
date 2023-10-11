import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class qualification {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int salary, expences;
        String gender, qualification;

        System.out.println("Enter your Qualification: ");
        qualification = bufferedReader.readLine();
        System.out.println("Enter your gender: ");
        gender = bufferedReader.readLine();
        System.out.println("Enter your salary: ");
        salary = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter your expences: ");
        expences = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Qualification: " + qualification);
        System.out.println("Gender: "+ gender);
        System.out.println("Salary: " + salary);
        System.out.println("Expences: " + expences);
        
    }
}
