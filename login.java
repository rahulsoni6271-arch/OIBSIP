import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("You are logged in");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println(attempts + " attempts remaining, try again");
                } else {
                    System.out.println("No attempts left. Access denied.");
                }
            }
        }

        sc.close();
    }
}