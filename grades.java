import java.io.*;
public class grades {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the marks: ");
        double n = Double.parseDouble(br.readLine());

        if (n <= 40) {
            System.out.println("Grade F");
        } else if (n <= 60) {
            System.out.println("Grade C");
        } else if (n <= 80) {
            System.out.println("Grade B");
        } else if (n <= 100) {
            System.out.println("Grade A");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
