import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string in uppercase: ");
        String str = sc.nextLine();

        String lower = str.toLowerCase();

        System.out.println("Lowercase string: " + lower);

        sc.close();
    }
}