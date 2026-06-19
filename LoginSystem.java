import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simple hardcoded credentials for the demo
        String adminUser = "admin";
        String adminPass = "1234";

        System.out.println("========================================");
        System.out.println("   WELCOME TO THE ONLINE EXAM PORTAL    ");
        System.out.println("========================================");
        
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Checking credentials
        if (username.equals(adminUser) && password.equals(adminPass)) {
            System.out.println("\nLogin Successful! Welcome, " + username);
            showMenu(); // Move to the next part of the app
        } else {
            System.out.println("\nInvalid Credentials! Please restart the app.");
        }
    }

    public static void showMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Start Examination");
        System.out.println("2. View Previous Results");
        System.out.println("3. Logout");
        System.out.print("Choose an option: ");
    }
}